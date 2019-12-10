package com.clxs.service;

import com.clxs.pojo.GuidePojo;
import org.springframework.stereotype.Service;

import java.util.List;

//导航的业务层的接口
@Service
public interface GuideService {

//    查询上架或下架的导航栏的内容
    public List<GuidePojo> SelectByNow(Integer rightNow);

}
