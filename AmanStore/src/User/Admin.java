package User;

public class Admin extends User {
	@Override
	boolean verifyUser() {
		return true;
	}	
}