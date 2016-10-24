import java.io.Serializable;

public class casual extends acqn implements Serializable{
	String cdate;
	String where;
	String circum;
	String info;//other useful information

	public casual(String name,String mob,String mail,String cdate, String where, String circum, String info) {
		this.name = name;
		this.mob = mob;
		this.email = mail;
		this.cdate = cdate;
		this.where = where;
		this.circum = circum;
		this.info = info;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getCircum() {
		return circum;
	}
	public void setCircum(String circum) {
		this.circum = circum;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
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
