package com.xjk.util;

import java.util.List;

public class PageBean {
	private List records;//某页的数据
	private int currentPage;//当前也
	private int totalPage;//总条数
	private int pageSize;//每页显示的数据
	
	private int firstPage=1;//首页
	private int lastPage;//末页
	private int pre;//上一页
	private int next;//下一页
	
	private int beginPage;//第一个显示的页码
	private int endPage;
//	public PageBean(){}
	public PageBean(List records, int currentPage, int totalPage, int pageSize) {
		this.records = records;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.pageSize = pageSize;
		lastPage=(totalPage+pageSize-1)/pageSize;
		pre=currentPage-1<=0?1:currentPage-1;
		next=currentPage+1>lastPage?lastPage:currentPage+1;
		if(lastPage<=10){
			beginPage=1;
			endPage=lastPage;
		}else{
			beginPage=currentPage-4;
			endPage=currentPage+5;
			if(beginPage<1){
				beginPage=1;
				endPage=10;
			}else if(endPage>lastPage){
				endPage=lastPage;
				beginPage=endPage-10+1;
			}
		}
	}

	public List getRecords() {
		return records;
	}

	public void setRecords(List records) {
		this.records = records;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getPre() {
		return pre;
	}

	public void setPre(int pre) {
		this.pre = pre;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public int getBeginPage() {
		return beginPage;
	}

	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
}
