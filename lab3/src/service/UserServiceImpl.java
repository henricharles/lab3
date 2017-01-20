package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import doa.UserRepo;
import doa.UserRepoImp;
import model.User;
@Service
public class UserServiceImpl implements UserService{
@Autowired
UserRepo repo;
	@Override
	public boolean authenticate(User user1) {
		if(repo.getUserByEmail(user1)!=null)
			return true;
		else
			return false;
	}

}
