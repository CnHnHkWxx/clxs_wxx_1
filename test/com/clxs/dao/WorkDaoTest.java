package com.clxs.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})

public class WorkDaoTest {

    @Autowired
    private WorkDao workDao;

    @Test
    public void selectByWorkId() {
        System.out.println(workDao.SelectByWorkId(1));
    }

    @Test
    public void selectByAll() {
        System.out.println(workDao.SelectByAll("9"));
    }

}
