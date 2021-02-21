package com.yuanyi.historia.bean;

/**
 * @name: 网站实体类
 * @author: yuanyi
 * @time：2021/02/19 19:05
 * @version：ver 1.0
 */
public class WebSite {

    private Integer id;

    private String name;

    private String username;

    private String url;

    public WebSite() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
