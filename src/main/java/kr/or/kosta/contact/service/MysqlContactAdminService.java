package kr.or.kosta.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.kosta.contact.dao.ContactsDao;
import kr.or.kosta.contact.model.Contact;

@Service("contactAdminService")
public class MysqlContactAdminService implements ContactAdminService {
	
	@Autowired
	private ContactsDao contactsDao;

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



