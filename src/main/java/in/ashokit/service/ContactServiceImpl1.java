package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Contact;
import in.ashokit.repository.ContactRepository;
@Service
public class ContactServiceImpl1 implements ContactService {

	private ContactRepository repository;
	
	public ContactServiceImpl1(ContactRepository repository)
	{
		this.repository=repository;
		}
	@Override
	public boolean saveOrUpdateContact(Contact contact) {
		Contact saveObj = repository.save(contact);
		
		if(saveObj.getContactId() !=null){
			return true;
		} else{
			return false;
			
		}
		//return (saveObj.getContactId() !=null) ? true : false;
		
		//return saveObj.getContactId()!=null;
		
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll=repository.findAll();
		return findAll;
		
		//return repository.findAll();
		
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById=repository.findById(contactId);
		if(findById.isPresent())
		{
			Contact contact=findById.get();
		}
		
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		boolean isDeleted=false;
		try {
			repository.deleteById(contactId);
			isDeleted=true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return  isDeleted;
	}

}
