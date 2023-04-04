package com.pojo;

import java.util.ArrayList;
import java.util.List;

public class Flight1 {
	 	private int page;
	 	private int per_page;
	 	private int total;
	 	private int total_pages;
	 	private ArrayList<FirstName> data;
	 	private Source support;
	 	
	 	public Flight1(int page, int per_page, int total, int total_pages, List<FirstName> fli, Source support) {
			super();
			this.page = page;
			this.per_page = per_page;
			this.total = total;
			this.total_pages = total_pages;
			this.data = (ArrayList<FirstName>) fli;
			this.support = support;
		}
	 	public int getPage() {
			return page;
		}
		public void setPage(int page) {
			this.page = page;
		}
		public void setPer_page(int per_page) {
			this.per_page = per_page;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		public void setTotal_pages(int total_pages) {
			this.total_pages = total_pages;
		}
		public void setData(ArrayList<FirstName> data) {
			this.data = data;
		}
		public void setSupport(Source support) {
			this.support = support;
		}
		public int getPer_page() {
			return per_page;
		}
		public int getTotal() {
			return total;
		}
		public int getTotal_pages() {
			return total_pages;
		}
		public ArrayList<FirstName> getData() {
			return data;
		}
		public Source getSupport() {
			return support;
		}
		
	}