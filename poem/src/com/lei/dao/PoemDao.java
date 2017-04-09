package com.lei.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lei.entity.Poetries;
@Repository("poemDao")
public class PoemDao {
	
	private SessionFactory sessionFactory;
	
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/**
	 * 按名字获取
	 * @param name 作者名字
	 * @return 返回全部信息
	 */
	public List<Poetries> selectByName(String name) {
		// 获取session
		Session session = sessionFactory.openSession();
		if(session==null){
			System.out.println("konde");
		}else{
			System.out.println("zhengc");
		}
		// 查询
		Query createQuery = session
			.createQuery("FROM Poetries  where poets.name ='"+ name+"'");
		// 获取结果
		@SuppressWarnings("unchecked")
		List<Poetries> list = createQuery.list();
		for (int i = 0; i < list.size(); i++) {
			Poetries object = (Poetries) list.get(i);
				System.out.print(object);
			System.out.println();
		}
		return list;
	}
	/**
	 * 按诗词题目获取
	 * @param title 诗词的题目
	 * @return 诗词的全部信息
	 */
	public List<Poetries> selectByTitle(String title) {
		// 获取session
		Session session = sessionFactory.openSession();
		// 查询
		Query createQuery = session
			.createQuery("FROM Poetries  where title = '"+ title+"'");
		// 获取结果
		@SuppressWarnings("unchecked")
		List<Poetries> list = createQuery.list();
		return list;
	}
	/**
	 * 按 诗词的内容获取
	 * @param content
	 * @return 诗词的全部信息
	 */
	public List<Poetries> selectByContent(String content) {
		// 获取session
		Session session = sessionFactory.openSession();
		// 查询
		Query createQuery = session
			.createQuery("Select Poetries FROM Poetries  where content like '"+ content+"'");
		// 获取结果
		@SuppressWarnings("unchecked")
		List<Poetries> list = createQuery.list();
		return list;
	}
}