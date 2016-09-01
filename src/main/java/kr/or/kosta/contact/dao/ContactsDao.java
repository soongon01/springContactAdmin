package kr.or.kosta.contact.dao;

import java.util.ArrayList;
import java.util.List;

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
public class ContactsDao {
	
	public void insertContact(Contact contact) {
		System.out.println("resgist ok..");
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




