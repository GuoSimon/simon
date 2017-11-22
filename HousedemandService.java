package com.ucan.housedemand.service;

import java.util.Map;

import com.ucan.common.BaseService;
import com.ucan.housedemand.bean.Housedemand;
public interface HousedemandService  extends BaseService<Housedemand, Integer> {

//	void saveNeed(Housedemand housedemand);

	void saveNeed(Map params);

}
