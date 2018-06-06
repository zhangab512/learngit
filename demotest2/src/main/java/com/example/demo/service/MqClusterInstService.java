package com.example.demo.service;

import com.example.demo.dao.MqClusterInstDao;
import com.example.demo.mapper.model.MqClusterInst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1、用户的增删改查
 * 2、修改用户密码
 * 3、修改用户的主题权限
 */
@Service
public class MqClusterInstService {
    @Autowired
    MqClusterInstDao mqClusterInstDao;

    public List<MqClusterInst> queryClusterInst(){
        return mqClusterInstDao.selectByExampleWithBLOBs();
    }
}
