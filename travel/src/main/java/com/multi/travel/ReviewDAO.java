package com.multi.travel;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReviewDAO {
	
	//mybatis 싱글톤 객체를 찾아서 주소를 넣어주세요.
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(ReviewVO bag) {
		int result = my.insert("review.create", bag);
		return result;
	}
	
	public int delete(Integer review_no) {
		int result = my.delete("review.del", review_no);
		return result;
	}
	
	public int update(ReviewVO bag) {
		int result = my.update("review.up", bag);
		return result;	
	}
	
	public ReviewVO one(Integer review_no) {
		ReviewVO bag = my.selectOne("review.one", review_no);
		return bag;
	}
	
	public List<ReviewVO> list() {
		List<ReviewVO> list = my.selectList("review.all");
		return list;
	}
}
