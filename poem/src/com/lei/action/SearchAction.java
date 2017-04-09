package com.lei.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lei.entity.Poetries;
import com.lei.service.SearchPome;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("searchAction")
public class SearchAction extends ActionSupport {

	private String searchCondition;
	private String searchType;
	private List<Poetries> searchResult;
	private SearchPome searchPome;
	@Resource
	public void setSearchPome(SearchPome searchPome) {
		this.searchPome = searchPome;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public List<Poetries> getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(List<Poetries> searchResult) {
		this.searchResult = searchResult;
	}

	public String execute() throws Exception {
		
		searchResult = searchPome.searchPome(searchType, searchCondition);
		System.out.println(searchCondition);
		System.out.println(searchType);
		if (0 == searchResult.size()) {
			return "fail";
		} else {
			return "success";
		}
	}

}
