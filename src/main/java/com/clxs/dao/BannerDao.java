package com.clxs.dao;

import com.clxs.pojo.BannerPojo;

import java.util.List;

//轮播的持久层的接口
public interface BannerDao {

    //    查询上架或下架的轮播图
    public List<BannerPojo> SelectByNow(Integer integer);

}
