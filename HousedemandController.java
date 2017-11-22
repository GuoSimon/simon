package com.ucan.housedemand.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ucan.common.Result;
import com.ucan.common.Result.Type;
import com.ucan.housedemand.bean.Housedemand;
import com.ucan.housedemand.service.HousedemandService;
import com.ucan.realestate.bean.RealestateDto;

@Controller
@RequestMapping("/housedemand")
public class HousedemandController {
	@Resource
	HousedemandService housedemandService;

	/**
	 * 
	 * @MethodName needup
	 * @Description
	 * @return ModelAndView
	 * @throws
	 * @date 2016年11月18日 下午2:28:46
	 * @author Kevin
	 *
	 */
	@RequestMapping("/needup")
	public ModelAndView needup() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("housedemand/needup");
		return mv;
	}

	@RequestMapping("/uploadNeed")
	@ResponseBody
	public String uploadNeedSubmit(
			@RequestParam (value="dTitle",required=false) String dTitle,
			@RequestParam (value="dPrice",required=false) String dPrice,
			@RequestParam (value="dAcreage",required=false) String dAcreage,
			@RequestParam (value="dDescribe",required=false) String dDescribe,
			@RequestParam (value="dContactname",required=false) String dContactname,
			@RequestParam (value="dContactgender",required=false) String dContactgender,
			@RequestParam (value="dContacphone",required=false) String dContacphone,
			@RequestParam (value="dType",required=false) String dType) {
		String result="fail";
		Map params = new HashMap();
		params.put("dTitle", dTitle);
		params.put("dPrice", dPrice);
		params.put("dAcreage", dAcreage);
		params.put("dDescribe", dDescribe);
		params.put("dContactname", dContactname);
		params.put("dContactgender", dContactgender);
		params.put("dContacphone", dContacphone);
		params.put("dType", dType);
		params.put("dBack", 0);
		params.put("dPubtime", new Date());
		
		housedemandService.saveNeed(params);
		result="success";
		return result;

	}

}
