package com.clxs.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})

public class BannerServiceTest {

    @Autowired
    private BannerService bannerService;

    @Test
    public void selectByUp() {
        System.out.println(bannerService.SelectByNow(1));
    }

    @Test
    public void selectByDown(){
        System.out.println(bannerService.SelectByNow(0));
    }

}
