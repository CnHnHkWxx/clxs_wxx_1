package com.clxs.service.impl;

import com.clxs.dao.MessageDao;
import com.clxs.pojo.MessagePojo;
import com.clxs.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//留言的业务层的接口的实现
@Service
public class MessageServiceimpl implements MessageService {

//    引入留言的持久层的接口
    @Autowired
    private MessageDao messageDao;

//    根据导航栏的内容ID查询对应的内容的留言
    @Override
    public List<MessagePojo> SelectByWorkId(Integer workId) {
        return messageDao.SelectByWorkId(workId);
    }

//    游客增加留言
    @Override
    public boolean InsertByMessage(MessagePojo message) {
        return messageDao.InsertByMessage(message);
    }

}
