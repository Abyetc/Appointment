/**
 *  @Title: Test.java 
 *  @Package com.cn21.FrequencyControl 
 *  @Description: TODO(用一句话描述该文件做什么) 
 *  @author chenxiaofeng
 *  @date 2016年8月8日 下午5:21:52 
 *  @version V1.0 
 */
package com.webank.Appointment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author 
 * @date 
 */
@Controller
@RequestMapping("/")
public class MainController {
	/**
	 * 欢迎页面
	 * @return void
	 */
	@RequestMapping(value = "")
	public ModelAndView welcome() {
		ModelAndView modelAndView = new ModelAndView("/welcome");
		return modelAndView;
	}

}
