package com.zhenhunfan.layout.listview;

public class FoodInfo {
    private int icon;
    private String title;
    private String content;

    public FoodInfo(int icon, String title, String content) {
        this.icon = icon;
        this.title = title;
        this.content = content;
    }

    public int getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
