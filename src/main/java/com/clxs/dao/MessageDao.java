package com.clxs.dao;

import com.clxs.pojo.MessagePojo;

import java.util.List;

//留言的持久层的接口
public interface MessageDao {

//    根据导航栏的内容ID查询对应内容的留言
    public List<MessagePojo> SelectByWorkId(Integer integer);

//    游客增加留言
    public boolean InsertByMessage(MessagePojo message);

}
