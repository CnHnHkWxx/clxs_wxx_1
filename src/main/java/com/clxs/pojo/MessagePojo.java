package com.clxs.pojo;

//留言
public class MessagePojo {

    //    主编号
    private Integer id;

    //    内容编号
    private Integer work_id;

    //    上下架状态
    private Integer right_now;

    //    创建时间
    private String new_time;

    //    创建人员
    private String new_name;

    //    更新时间
    private Long update_time;

    //    更新人员
    private Integer update_id;

    //    留言内容
    private String content;

    @Override
    public String toString() {
        return "MessagePojo{" +
                "id=" + id +
                ", work_id=" + work_id +
                ", right_now=" + right_now +
                ", new_time='" + new_time + '\'' +
                ", new_name='" + new_name + '\'' +
                ", update_time=" + update_time +
                ", update_id=" + update_id +
                ", content='" + content + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWork_id() {
        return work_id;
    }

    public void setWork_id(Integer work_id) {
        this.work_id = work_id;
    }

    public Integer getRight_now() {
        return right_now;
    }

    public void setRight_now(Integer right_now) {
        this.right_now = right_now;
    }

    public String getNew_time() {
        return new_time;
    }

    public void setNew_time(String new_time) {
        this.new_time = new_time;
    }

    public String getNew_name() {
        return new_name;
    }

    public void setNew_name(String new_name) {
        this.new_name = new_name;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}