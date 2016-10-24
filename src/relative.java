import java.io.Serializable;

public class relative extends acqn implements Serializable{
	private String bday;
	private String dolm;//date of last meating
	
	public relative(String name,String mob,String mail,String bday, String dolm) {
		this.name = name;
		this.mob = mob;
		this.email = mail;
		this.bday = bday;
		this.dolm = dolm;
	}
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	public String getDolm() {
		return dolm;
	}
	public void setDolm(String dolm) {
		this.dolm = dolm;
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
