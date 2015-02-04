package application.dao;

import java.util.ArrayList;
import java.util.List;

import application.pojo.Address;
import application.pojo.PickUpDetails;
import application.pojo.User;

public enum DaoImplementation {

	daoImplementation;
	
	List<User> registerdUser = new ArrayList<>();
	List<Address> addresslist=new ArrayList<>();
	List<PickUpDetails> pickUpDetails=new ArrayList<>();

	public boolean userRegistration(User user,Address address) {
		
		for(User i:registerdUser){
			if(i.getEmail().equals(user.getEmail())){
				return false;
			}
		}
		registerdUser.add(user);
		addresslist.add(address);
		return true;
	};
	
	public User getAddress(PickUpDetails details){
		for(User i:registerdUser){
			if(i.getEmail().equals(details.getEmail())){
				return i;
			}
		}
		return null;
	}
}
