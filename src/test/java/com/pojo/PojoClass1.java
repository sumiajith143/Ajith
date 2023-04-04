package com.pojo;

import java.util.ArrayList;

public class PojoClass1 {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<PojoClass2> data;
	private PojoClass3 support;

	private int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public ArrayList<PojoClass2> getData() {
		return data;
	}

	public void setData(ArrayList<PojoClass2> data) {
		this.data = data;
	}

	public PojoClass3 getSupport() {
		return support;
	}

	public void setSupport(PojoClass3 support) {
		this.support = support;
	}

}