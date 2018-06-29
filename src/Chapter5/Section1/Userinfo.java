package Chapter5.Section1;

public class Userinfo {
	private  String userName;
	private String password;
	
	public Userinfo() {
		// TODO Auto-generated constructor stub
	}
	
	public Userinfo(String userName,String password) {
		// TODO Auto-generated constructor stub
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
