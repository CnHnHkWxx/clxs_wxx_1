package com.clxs.pojo;

//留言
public class MessagePojo {

    //    主编号
    private Integer id;

    //    内容编号
    private Integer workId;

    //    上下架状态
    private Integer rightNow;

    //    创建时间
    private Long newTime;

    //    创建人员
    private String newName;

    //    更新时间
    private Long updateTime;

    //    更新人员
    private Integer updateId;

    //    留言内容
    private String content;

    @Override
    public String toString() {
        return "MessagePojo{" +
                "id=" + id +
                ", workId=" + workId +
                ", rightNow=" + rightNow +
                ", newTime=" + newTime +
                ", newName='" + newName + '\'' +
                ", updateTime=" + updateTime +
                ", updateId=" + updateId +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}