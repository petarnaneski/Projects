import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("Petar","java");
		logininfo.put("Bojan","arhitektura");
		logininfo.put("Darko","horoskop");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
