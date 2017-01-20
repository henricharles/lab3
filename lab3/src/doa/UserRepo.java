package doa;

import java.util.List;

import model.User;

public interface UserRepo {
	public List<User> getAllUser();
	public User getUserByEmail(User user);

}
