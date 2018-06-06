package com.example.demo.controller;


import com.alibaba.druid.support.json.JSONUtils;
import com.example.demo.mapper.model.MqClusterInst;
import com.example.demo.service.MqClusterInstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/cluster")
public class ClusterController {
    @Autowired
    MqClusterInstService mqClusterInstService;


    @RequestMapping(value="/query")
    public Object queryCluster() {
        List<MqClusterInst> MqClusterInsts = mqClusterInstService.queryClusterInst();
        System.out.println("打印输出....." + JSONUtils.toJSONString(MqClusterInsts));
        return MqClusterInsts;
    }
}
