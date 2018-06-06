package com.example.demo.dao;

import com.example.demo.mapper.MqClusterInstMapper;
import com.example.demo.mapper.model.MqClusterInst;
import com.example.demo.mapper.model.MqClusterInstExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MqClusterInstDao {
    @Autowired
    MqClusterInstMapper mqClusterInstMapper;
   public  List<MqClusterInst> selectByExampleWithBLOBs(){
       MqClusterInstExample example = new MqClusterInstExample();
       example.createCriteria().andClusterNameIsNull();
       return mqClusterInstMapper.selectByExample(example);
   }

}
