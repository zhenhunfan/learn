## 本项目演示广播

## 演示内容

1. B01 自定义广播和自定义接收器，静态注册
2. B02 系统广播和自定义接收器，动态注册
3. B03 短信接收器，静态注册
4. B04 开机广播接收器
5. B05 强制下线

### 两大类

1.系统广播

2.自定义广播



### 按照传播方式分

1. 有序广播 权限机制
2. 常规广播

### 接收器 Receiver

1. 必须派生自BroadcastReceiver

2. 注册接收器

   静态注册和动态注册

静态注册:

```xml
<!-- AndroidManifest.xml -->
<application>
    <receiver android:name=".receiver.B01Receiver" android:exported="true" android:enabled="true">
        <intent-filter>
            <action android:name="com.zhenhunfan.broadcast.demo.view.B01MyBroadcast.MYBROADCAST"/>
        </intent-filter>
    </receiver>
</application>
```



动态注册：

```java
IntentFilter filter = new IntentFilter();
//网络改变
filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
receiver = new B02Receiver();
registerReceiver(receiver,filter);
```

> 1.用完需要注销receiver
>
> 2.接收器有优先级，使用在有序广播中
>
> 3.有些action，需要配置permission
