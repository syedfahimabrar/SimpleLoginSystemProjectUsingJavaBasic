package constructor;

public class Userdata {
	public String Username;
	private String Password;
	public Userdata(String Username,String Password)
	{
		this.Username=Username;
		this.Password=Password;
	}
	public boolean passmatch(String Username,String Password)
	{
		if(Username.equals(this.Username)&&Password.equals(this.Password))return true;
		else return false;
	}

}
