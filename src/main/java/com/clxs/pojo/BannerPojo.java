package com.clxs.pojo;

//轮播
public class BannerPojo {

    //    主编号
    private Integer id;

    //    上下架状态
    private Integer rightNow;

    //    创建时间
    private Long newTime;

    //    创建人员
    private Integer newId;

    //    更新时间
    private Long updateTime;

    //    更新人员
    private Integer updateId;

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
                ", rightNow=" + rightNow +
                ", newTime=" + newTime +
                ", newId=" + newId +
                ", updateTime=" + updateTime +
                ", updateId=" + updateId +
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

    public Integer getRightNow() {
        return rightNow;
    }

    public void setRightNow(Integer rightNow) {
        this.rightNow = rightNow;
    }

    public Long getNewTime() {
        return newTime;
    }

    public void setNewTime(Long newTime) {
        this.newTime = newTime;
    }

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
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