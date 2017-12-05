package com.ketan.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ketan.dto.Users;

public class HibernateTest {

	public static void main(String[] args) {

		/*UserDetails user = new UserDetails();
		user.setUserName("FirstUser");
		user.setAddress(new Address("galo no 5", "sirsa", "haryana", "125055"));
		user.setJoiningDate(new Date());
		user.setDescription("first user description");
		user.getListOfAddresses().add(new Address("galo no 5", "sirsa", "haryana", "125055"));
		user.getListOfAddresses().add(new Address("galo no 6", "sirsa2", "haryana2", "785926"));
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		session = sessionFactory.openSession();
		user = session.get(UserDetails.class, 1);
		session.close();
		System.out.println(user.getListOfAddresses());
		sessionFactory.close();*/

		/*Vehicle v1 = new Vehicle();
		v1.setVehicleName("mercedez");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("bike");
		bike.setSteeringHandle("bike steering handle");
		FourWheeler car = new FourWheeler();
		car.setVehicleName("porche");
		car.setSteeringWheel("porshe steering wheel");
		
		HondaCar crv = new HondaCar();
		crv.setSteeringWheel("crv wheel");
		crv.setType("crv");
		crv.setVehicleName("honda crv");*/

		/*	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			String b = "5";
			Query query = session.createNamedQuery("Users.byName");
			query.setParameter("username", "User9");
			// query.setFirstResult(5);
			query.setMaxResults(4);
			System.out.println(query.uniqueResult());
			Users u = (Users) query.uniqueResult();
			System.out.println(u.getUserId());
			Users expuser = new Users();
			expuser.setUserName("User9");
		
			Example exp = Example.create(expuser).enableLike();
			Criteria criteria = session.createCriteria(Users.class).add(exp);
			// criteria.add(Restrictions.or(Restrictions.between("userId", 1, 3),
			// Restrictions.like("userName", "%User9")));
			List<String> list = criteria.list();
			System.out.println(list);
			for (String s : list) {
				System.out.println(s);
			}
			session.getTransaction().commit();
			session.close();*/

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Users users = session.get(Users.class, 1);
		session.getTransaction().commit();
		session.close();

		Session session2 = sessionFactory.openSession();
		session2.beginTransaction();

		Users users2 = session2.get(Users.class, 1);
		session2.getTransaction().commit();
		session2.close();
		System.out.println("completed");

	}
}
