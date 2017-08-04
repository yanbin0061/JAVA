package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageControcller {
	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String  showIndex(){
		return "index";
	}
	/**
	 * 展示其他页面
	 * <p>Title: showPage</p>
	 * <p>Description: </p>
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}

}
