package com.lei.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lei.dao.PoemDao;
import com.lei.entity.Poetries;
@Service("searchPome")
public class SearchPome {
	private PoemDao poemDao;
	@Resource
	public void setPoemDao(PoemDao poemDao) {
		this.poemDao = poemDao;
	}

	private List<Poetries> searchResult = null;
	
	public List<Poetries> searchPome(String searchType, String searchCondition) {
		switch (searchType) {
		case "1":
			searchResult = poemDao.selectByName(searchCondition);
			break;
		case "2":
			searchResult = poemDao.selectByTitle(searchCondition);
			break;
		case "3":
			searchResult = poemDao.selectByContent(searchCondition);
			break;
		}
		return searchResult;
	}
}
