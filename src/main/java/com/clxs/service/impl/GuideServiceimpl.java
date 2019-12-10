package com.clxs.service.impl;

import com.clxs.dao.GuideDao;
import com.clxs.pojo.GuidePojo;
import com.clxs.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//导航的业务层的接口的实现
@Service
public class GuideServiceimpl implements GuideService {

//    引入导航的持久层的接口
    @Autowired
    private GuideDao guideDao;

//    查询上架或下架的导航栏的内容
    @Override
    public List<GuidePojo> SelectByNow(Integer rightNow) {
        return guideDao.SelectByNow(rightNow);
    }

}
