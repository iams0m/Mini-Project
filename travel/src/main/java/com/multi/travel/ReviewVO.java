package com.multi.travel;

public class ReviewVO {
	private int review_no;
	private String nickname;
	private String review_content;
	private String review_date;

	public int getReview_no() {
		return review_no;
	}

	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getReview_content() {
		return review_content;
	}

	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}

	public String getReview_date() {
		return review_date;
	}

	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}

	@Override
	public String toString() {
		return "ReviewVO [review_no=" + review_no + ", nickname=" + nickname + ", review_content=" + review_content
				+ ", review_date=" + review_date + "]";
	}

}
