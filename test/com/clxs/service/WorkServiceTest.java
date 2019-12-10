package com.clxs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})

public class WorkServiceTest {

    @Autowired
    private WorkService workService;

    @Test
    public void selectByWorkId() {
        System.out.println(workService.SelectByWorkId(1));
    }

    @Test
    public void selectByAll() {
        System.out.println(workService.SelectByAll("9"));
    }

}
