package com.clxs.service.impl;

import com.clxs.dao.BannerDao;
import com.clxs.pojo.BannerPojo;
import com.clxs.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//轮播的业务层的接口的实现
@Service
public class BannerServiceimpl implements BannerService {

//    引入轮播的持久层的接口
    @Autowired
    private BannerDao bannerDao;

//    查询上架或下架的轮播图
    @Override
    public List<BannerPojo> SelectByNow(Integer rightNow) {
        return bannerDao.SelectByNow(rightNow);
    }

}
