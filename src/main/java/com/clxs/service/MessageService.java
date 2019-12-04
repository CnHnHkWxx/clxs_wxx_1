package com.clxs.service;

import com.clxs.pojo.MessagePojo;
import org.springframework.stereotype.Service;

import java.util.List;

//留言的业务层的接口
@Service
public interface MessageService {

//    根据导航栏的内容ID查询对应的内容的留言
    public List<MessagePojo> SelectByWorkId(Integer integer);

//    游客增加留言
    public boolean InsertByMessage(MessagePojo message);

}
