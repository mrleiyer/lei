package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class first {
	@Test
	public void select() {
		// 创建session
		Configuration cfg = new Configuration().configure();

		SessionFactory sf = cfg.configure().buildSessionFactory();

		Session session = sf.openSession();
		session.beginTransaction();

		// 查询
		Query createQuery = session
			.createQuery("Select poets.name,count(*) as count FROM Poetries  where  CHAR_LENGTH(poets.name) = 3 group by poets.name");
		session.getTransaction().commit();
		// 遍历结果
		@SuppressWarnings("unchecked")
		List<Object> list = createQuery.list();
		for (int i = 0; i < list.size(); i++) {
			Object[] object = (Object[]) list.get(i);
			for (int j = 0; j < object.length; j++) {
				System.out.print(object[j]);
				if (j != object.length - 1) {
					System.out.print(":");
				}
			}
			System.out.println();
		}
		session.close();
	}
}