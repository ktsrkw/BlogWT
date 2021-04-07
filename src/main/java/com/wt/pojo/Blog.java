package com.wt.pojo;

import java.util.Date;

public class Blog {
    private int id;
    private String content;
    private Date time;
    private String category;

    public Blog(int id, String content, Date time, String category) {
        this.id = id;
        this.content = content;
        this.time = time;
        this.category = category;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", category='" + category + '\'' +
                '}';
    }
}
