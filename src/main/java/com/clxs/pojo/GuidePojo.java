package com.clxs.pojo;

//导航
public class GuidePojo {

    //    主编号
    private Integer id;

    //    副编号
    private Integer pid;

    //    内容编号
    private Integer workId;

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

    @Override
    public String toString() {
        return "GuidePojo{" +
                "id=" + id +
                ", pid=" + pid +
                ", workId=" + workId +
                ", rightNow=" + rightNow +
                ", newTime=" + newTime +
                ", newId=" + newId +
                ", updateTime=" + updateTime +
                ", updateId=" + updateId +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
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

}