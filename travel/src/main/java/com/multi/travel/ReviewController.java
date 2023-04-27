package com.multi.travel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@Autowired
	ReviewDAO dao; // 전역변수(글로벌 변수)

//	@RequestMapping("insert")
//	public void insert(ReviewVO bag) {
//		System.out.println("insert요청됨.");
//		System.out.println(bag);
//		dao.insert(bag);
//	}

	@RequestMapping("update")
	public void update(ReviewVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}

	@RequestMapping("delete")
	public void delete(Integer review_no) {
		System.out.println("delete요청됨.");
		System.out.println(review_no);
		dao.delete(review_no);
	}

	@RequestMapping("one")
	public void one(Integer review_no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(review_no);
		ReviewVO bag = dao.one(review_no);
		// views 아래 one.jsp까지 전달할 데이터를 model 객체를 이용해서
		// 속성으로 지정합니다.
		model.addAttribute("bag", bag);
	}

	@RequestMapping("list")
	public void list(Model model) {
		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
		List<ReviewVO> list = dao.list();
		model.addAttribute("list", list);
	}

}
