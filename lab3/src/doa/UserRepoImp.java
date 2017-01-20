package doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.User;

@Repository
public class UserRepoImp implements UserRepo {
List<User> userlist=new ArrayList<>();
	@Override
	public List<User> getAllUser() {
		
		User user1=new User("Charles","2kkhenricharles@gmail.com","ladetermination");
		User user2=new User("Henri","henricharles@gmail.com","K123");
		User user3=new User("paper","paper@gmail.com","K123");
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		return userlist;
		
	}

	@Override
	public User getUserByEmail(User user1) {
		userlist=getAllUser();
		for(User user:userlist)
		{
			if(user.getEmail().equals(user1.getEmail()) && user.getPassword().equals(user1.getPassword()))
				return user;
		}
		return null;
	}

}
