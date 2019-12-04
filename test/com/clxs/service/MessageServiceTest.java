package com.clxs.service;

import com.clxs.pojo.MessagePojo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})

public class MessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Test
    public void selectByWorkId() {
        System.out.println(messageService.SelectByWorkId(1));
    }

    @Test
    public void insertByMessage() {

        MessagePojo messagePojo = new MessagePojo();

        messagePojo.setWork_id(1);
        messagePojo.setRight_now(1);
        messagePojo.setNew_time("1997");
        messagePojo.setNew_name("NMSL");
        messagePojo.setUpdate_time(null);
        messagePojo.setUpdate_id(null);
        messagePojo.setContent("游戏可以输，但嘴巴一定要臭。");

        System.out.println(messageService.InsertByMessage(messagePojo));
    }

}
