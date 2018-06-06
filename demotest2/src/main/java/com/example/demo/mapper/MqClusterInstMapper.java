package com.example.demo.mapper;

import com.example.demo.mapper.model.MqClusterInst;
import com.example.demo.mapper.model.MqClusterInstExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MqClusterInstMapper {
    int countByExample(MqClusterInstExample example);

    int deleteByExample(MqClusterInstExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MqClusterInst record);

    int insertSelective(MqClusterInst record);

    List<MqClusterInst> selectByExampleWithBLOBs(MqClusterInstExample example);

    List<MqClusterInst> selectByExample(MqClusterInstExample example);

    MqClusterInst selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MqClusterInst record, @Param("example") MqClusterInstExample example);

    int updateByExampleWithBLOBs(@Param("record") MqClusterInst record, @Param("example") MqClusterInstExample example);

    int updateByExample(@Param("record") MqClusterInst record, @Param("example") MqClusterInstExample example);

    int updateByPrimaryKeySelective(MqClusterInst record);

    int updateByPrimaryKeyWithBLOBs(MqClusterInst record);

    int updateByPrimaryKey(MqClusterInst record);
}