package encapsulation;

public class ClassA {

	private String userName; //Test@123
	private int passWord;

	public String getUserName() {
		return userName;
	}

	public int getPassWord() {
		return passWord;
	}

	public void setUserName(String user) {
		this.userName = user;
	}
	
	public void setPassWord(int pass) {
		this.passWord = pass;
	}

}
