package com.clxs.dao;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})

public class BannerDaoTest {

    @Autowired
    BannerDao bannerDao;

    @Test
    public void selectByUp() {
        System.out.println(bannerDao.SelectByNow(1));
    }

    @Test
    public void selectByDown(){
        System.out.println(bannerDao.SelectByNow(0));
    }

}
