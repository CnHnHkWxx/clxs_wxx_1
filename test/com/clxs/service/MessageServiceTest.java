package com.clxs.service;

import com.clxs.pojo.MessagePojo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

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

        for (int i=1;i<10;i++){
            MessagePojo messagePojo = new MessagePojo();
            messagePojo.setWorkId(1);
            messagePojo.setRightNow(1);
            messagePojo.setNewTime(System.currentTimeMillis());
            messagePojo.setNewName(getUUID());
            messagePojo.setUpdateTime(System.currentTimeMillis());
            messagePojo.setUpdateId(null);
            messagePojo.setContent(getUUID());
            System.out.println(messageService.InsertByMessage(messagePojo));
        }

    }

    public static String getUUID(){
        UUID uuid= UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", "");
        return uuidStr;
    }

}
