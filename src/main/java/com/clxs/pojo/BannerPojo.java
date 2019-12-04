package com.clxs.pojo;

//轮播
public class BannerPojo {

    //    主编号
    private Integer id;

    //    上下架状态
    private Integer right_now;

    //    创建时间
    private Long new_time;

    //    创建人员
    private Integer new_id;

    //    更新时间
    private Long update_time;

    //    更新人员
    private Integer update_id;

    //    名称
    private String name;

    //    图片地址
    private String img;

    //    跳转地址
    private String url;

    @Override
    public String toString() {
        return "BannerPojo{" +
                "id=" + id +
                ", right_now=" + right_now +
                ", new_time=" + new_time +
                ", new_id=" + new_id +
                ", update_time=" + update_time +
                ", update_id=" + update_id +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRight_now() {
        return right_now;
    }

    public void setRight_now(Integer right_now) {
        this.right_now = right_now;
    }

    public Long getNew_time() {
        return new_time;
    }

    public void setNew_time(Long new_time) {
        this.new_time = new_time;
    }

    public Integer getNew_id() {
        return new_id;
    }

    public void setNew_id(Integer new_id) {
        this.new_id = new_id;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}