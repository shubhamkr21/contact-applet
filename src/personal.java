import java.io.Serializable;

public class personal extends acqn implements Serializable{
	public personal(String name,String mob,String mail,String context, String acqdate, String events) {
		this.name = name;
		this.mob = mob;
		this.email = mail;
		this.context = context;
		this.acqdate = acqdate;
		this.events = events;
	}
	private String context;
	private String acqdate;
	private String events;
	
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getAcqdate() {
		return acqdate;
	}
	public void setAcqdate(String acqdate) {
		this.acqdate = acqdate;
	}
	public String getEvents() {
		return events;
	}
	public void setEvents(String events) {
		this.events = events;
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
