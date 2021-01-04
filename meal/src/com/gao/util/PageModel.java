package com.gao.util;

import java.util.List;

public class PageModel<T> {
	private int pageSize;//
	private int pageNo;//
	private List<T> datas;//
	private int totalCount;//
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getTotalPage(){//
		return totalCount%pageSize == 0?totalCount/pageSize:totalCount/pageSize+1;
	}
	
	public int getPreviousNo(){
		if(this.pageNo==1){
			return 1;
		}else{
			return this.pageNo-1;
		}
	}
	public int getNextNo(){
		if(this.pageNo==this.getTotalPage()){
			return this.getTotalPage();
		}else{
			return this.pageNo+1;
		}
	}
	
}
