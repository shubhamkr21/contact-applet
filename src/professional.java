import java.io.Serializable;

public class professional extends acqn implements Serializable{
	private String interest;

	public String getInterest() {
		return interest;
	}

	public professional(String name,String mob,String mail,String interest) {
		this.name = name;
		this.mob = mob;
		this.email = mail;
		this.interest = interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	public void setname(String name){
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setmobile(String m){
		this.mob = m;
	}
	public String getmobile(){
		return mob;
	}
	public String get_email(){
		return email;
	}
	public void set_email(String mail){
		this.email = mail;
	}

}
