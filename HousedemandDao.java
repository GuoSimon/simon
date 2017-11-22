package com.ucan.housedemand.dao;

import java.util.Map;

import com.ucan.housedemand.bean.Housedemand;

public interface HousedemandDao {
    int deleteByPrimaryKey(Integer dId);

    int insert(Housedemand record);

    int insertSelective(Housedemand record);

    Housedemand selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Housedemand record);

    int updateByPrimaryKey(Housedemand record);

//	void saveNeed(Housedemand housedemand);

	void saveNeed(Map params);
}