package kr.or.kosta.contact.service;

import java.util.ArrayList;
import java.util.List;

import kr.or.kosta.contact.dao.ContactsDao;
import kr.or.kosta.contact.model.Contact;

public class MysqlContactAdminService implements ContactAdminService {
	
	private ContactsDao contactsDao;
	
	public void setContactsDao(ContactsDao dao) {
		this.contactsDao = dao;
	}

	public void registContact(Contact contact) {
		contactsDao.insertContact(contact);
	}

	public Contact searchContactById(int id) {
		return contactsDao.selectContactById(id);
	}

	public List<Contact> getAllContacts() {
		return contactsDao.selectAll();
	}

}



