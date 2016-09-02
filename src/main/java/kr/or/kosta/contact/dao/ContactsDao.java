package kr.or.kosta.contact.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.kosta.contact.model.Contact;

/**
 * contacts 테이블을 데이터를 조작하는 메소드가 위치
 * C .. 데이터 인서트
 * R .. 데이터 검색(전체보기)
 * U .. 데이터 업데이트
 * D .. 데이터 삭제
 * @author user
 *
 */

@Repository("contactDao")
public class ContactsDao {
	
	@Autowired
	private DataSource dataSource;
	
	public void insertContact(Contact contact) {
		
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println("connection borrowed..");
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		finally {
			try {
				conn.close();
				System.out.println("connection released..");
			} catch (Exception e) {}
		}
	}
	
	public Contact selectContactById(int id) {
		System.out.println("search ok..");
		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("kim");
		contact.setEmail("kim@a.a");
		contact.setAge(30);
		contact.setAddr("seoul");
		return contact;
	}
	
	public List<Contact> selectAll() {
List<Contact> contactList = new ArrayList<Contact>();
		
		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("kim");
		contact.setEmail("kim@a.a");
		contact.setAge(30);
		contact.setAddr("seoul");
		contactList.add(contact);
		
		contact = new Contact();
		contact.setId(2);
		contact.setName("lee");
		contact.setEmail("lee@a.a");
		contact.setAge(40);
		contact.setAddr("seoul");
		contactList.add(contact);

		contact = new Contact();
		contact.setId(3);
		contact.setName("park");
		contact.setEmail("park@a.a");
		contact.setAge(50);
		contact.setAddr("seoul");
		contactList.add(contact);

		return contactList;
	}

}




