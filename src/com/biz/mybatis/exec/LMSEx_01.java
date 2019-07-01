package com.biz.mybatis.exec;

import com.biz.mybatis.service.ScoreService;
import com.biz.mybatis.service.StdService;

public class LMSEx_01 {

	public static void main(String[] args) {
		
		StdService stdService = new StdService();
		ScoreService scoreService  = new ScoreService();
		while(true) {
			
			System.out.println("===============================");
			System.out.println("빛나리 고교 학사 관리");
			System.out.println("-------------------------------");
			if(stdService.isNotStd()) stdService.insertStd();
			
			String st_num = stdService.getSt_num();
			
			scoreService.setSt_num(st_num);
			scoreService.viewScore(st_num);
			scoreService.insertScore(st_num);
			//성적을 입력하기 위해서 
		}
		
	}

}
