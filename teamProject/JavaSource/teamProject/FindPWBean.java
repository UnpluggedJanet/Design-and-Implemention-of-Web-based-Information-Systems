package teamProject;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import org.apache.struts.validator.* ;

public class FindPWBean extends ValidatorForm {
	private String memberName="";
	private String memberEmail="";
	private String memberID="";
	private String memberPW="";
	
	public String getMemberPW() {
		return memberPW;
	}
	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	private String warning="";
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getWarning() {
		return warning;
	}
	public void setWarning(String warning) {
		this.warning = warning;
	}	 
}

