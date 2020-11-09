package com.zhenhunfan.carousel.figure;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.ContactsContract;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewPagerDemoActivity extends AppCompatActivity {

    private ImageView indicator; //表示圆点指示器
    private ImageView[] indicators; //表示4个圆点指示器的数组
    private boolean isContinue=true;
    private ViewPager viewPager;
    private ViewGroup group;   //承载指示器的线性布局
    private AtomicInteger index = new AtomicInteger(); //指示当前显示的图的索引
    private Handler viewHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            viewPager.setCurrentItem(msg.what);
        }
    }; //用于多线程间传讯

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_demo);
        initView();
    }

    /**
     * 初始化视图
     */
    private void initView(){
        viewPager = findViewById(R.id.vp_adv);
        group = findViewById(R.id.view_indicators);

        //4张广告图片加入到集合中进行保存
        List<View> listPics = new ArrayList<>();
        ImageView img1 = new ImageView(this);
        img1.setBackgroundResource(R.drawable.c9bb57c02a78514a9bd1ebf6d6101340);
        listPics.add(img1);

        ImageView img2 = new ImageView(this);
        img2.setBackgroundResource(R.drawable.e3c1b677acd80833d0f5c8c023fb08c1);
        listPics.add(img2);

        ImageView img3 = new ImageView(this);
        img3.setBackgroundResource(R.drawable.a58);
        listPics.add(img3);

        ImageView img4 = new ImageView(this);
        img4.setBackgroundResource(R.drawable.b95);
        listPics.add(img4);

        //动态设置4个圆点的属性
        indicators = new ImageView[listPics.size()];
        for(int i =0; i<indicators.length;i++){
            indicator = new ImageView(this);
            indicator.setLayoutParams(new LinearLayout.LayoutParams(40,40));
            indicator.setPadding(5,5,5,5);
            indicators[i] = indicator;
            if(i==0){
                indicators[i].setBackgroundResource(R.drawable.banner_dian_focus);
            }else{
                indicators[i].setBackgroundResource(R.drawable.banner_dian_blur);
            }
            group.addView(indicators[i]);
        }

        //设置ViewPage的适配器
        viewPager.setAdapter(new MyPageAdapter(listPics));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                //当ViewPage切换图片的时候，右下的图标也进行切换
                index.getAndSet(position);
                for(int i=0;i<indicators.length;i++){
                    if(i == position){
                        indicators[i].setBackgroundResource(R.drawable.banner_dian_focus);
                    }else{
                        indicators[i].setBackgroundResource(R.drawable.banner_dian_blur);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        //当没有手动切换图标的时候，ViewPage自动每隔一定的时间自动切换
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(isContinue){
                        viewHandler.sendEmptyMessage(index.get());
                        whatOption();
                    }
                }
            }
        }).start();

        viewPager.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        isContinue = false;
                        break;
                    case MotionEvent.ACTION_UP:
                        isContinue = true;
                        break;
                }
                return false;
            }
        });
    }

    private void whatOption(){
        //将当前位置值+1
        index.incrementAndGet();
        //假如当前位置超出了指示器的数量，则还原到0
        if(index.get() > indicators.length-1){
            index.getAndAdd(-4);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyPageAdapter extends PagerAdapter{
    private List<View> viewList;

    public MyPageAdapter(List<View> viewList){
        this.viewList = viewList;
    }

    @Override
    public int getCount() {
        return viewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        //当前这个位置的视图，是否由instantiateItem提供
        return view == object;
    }

    /**
     * 对应ViewPager中视图的创建
     * @param container
     * @param position
     * @return
     */
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(viewList.get(position),0);
        return viewList.get(position);
    }

    /**
     * 对应ViewPager中视图的移除
     * @param container
     * @param position
     * @return
     */
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(viewList.get(position));
    }
}
