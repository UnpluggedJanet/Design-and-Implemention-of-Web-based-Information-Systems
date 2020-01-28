package teamProject;

import javax.servlet.http.* ;
import org.apache.struts.action.* ;

public class LoginInfoBean extends ActionForm {
	private String memberID = "";
	private String memberPW = "";
	private String warning = "";

	
	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getWarning() {
		return warning;
	}

	public void setWarning(String warning) {
		this.warning = warning;
	}

	public boolean isMissing(String value){
		return((value == null)||(value.trim().equals("")));
	}

	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request){
		ActionErrors errors = new ActionErrors();
		if(isMissing(memberID))
			errors.add("id", new ActionMessage("id.required"));
		if(isMissing(memberPW))
			errors.add("password", new ActionMessage("password.required"));
		return (errors);
	}
	
}
