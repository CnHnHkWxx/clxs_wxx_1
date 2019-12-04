package com.clxs.service;

import com.clxs.pojo.BannerPojo;
import org.springframework.stereotype.Service;

import java.util.List;

//轮播的业务层的接口
@Service
public interface BannerService {

//    查询上架或下架的轮播图
    public List<BannerPojo> SelectByNow(Integer integer);

}
