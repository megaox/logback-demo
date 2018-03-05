package com.geek.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestCase {
	@GetMapping("test")
	public void justTest(){
		log.debug("记录debug日志");
		log.info("访问了index方法");
		log.error("记录error错误日志");
	}

}
