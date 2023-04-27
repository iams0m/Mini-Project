package com.multi.travel;

public class FestaVO {
	private String festa_img;
	private String festa_title;
	private String brief_contents;
	private String festa_date;
	private String festa_area;
	private String festa_detail;

	public String getFesta_img() {
		return festa_img;
	}

	public void setFesta_img(String festa_img) {
		this.festa_img = festa_img;
	}

	public String getFesta_title() {
		return festa_title;
	}

	public void setFesta_title(String festa_title) {
		this.festa_title = festa_title;
	}

	public String getBrief_contents() {
		return brief_contents;
	}

	public void setBrief_contents(String brief_contents) {
		this.brief_contents = brief_contents;
	}

	public String getFesta_date() {
		return festa_date;
	}

	public void setFesta_date(String festa_date) {
		this.festa_date = festa_date;
	}

	public String getFesta_area() {
		return festa_area;
	}

	public void setFesta_area(String festa_area) {
		this.festa_area = festa_area;
	}

	public String getFesta_detail() {
		return festa_detail;
	}

	public void setFesta_detail(String festa_detail) {
		this.festa_detail = festa_detail;
	}

	@Override
	public String toString() {
		return "FestaVO [festa_img=" + festa_img + ", festa_title=" + festa_title + ", brief_contents=" + brief_contents
				+ ", festa_date=" + festa_date + ", festa_area=" + festa_area + ", festa_detail=" + festa_detail + "]";
	}

}