package teamProject;
import javax.servlet.http.* ;

import org.apache.struts.action.* ;

public class FindPW extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception{
		FindPWBean findPWData = (FindPWBean)form;
		FindPWDataBean finddb = new FindPWDataBean();
		FindData findData = new FindData() ;
		String memberID, memberName, memberEmail;		
		String[] userInfo = new String[2]; 
		HttpSession session ;

		memberID = findPWData.getMemberID();
		memberName = findPWData.getMemberName();
		memberEmail = findPWData.getMemberEmail();

		
		userInfo = finddb.checkMemberPW(memberID, memberName, memberEmail);
		
		if(userInfo[0].equals("-1")){
			findPWData.setWarning("존재하지 않는 회원입니다.");
			return mapping.findForward("nonexist-ID");
		}
		else{			
	        findData.setId(userInfo[0]);
	        session = request.getSession();
	        session.setAttribute("memberid", findData); 
	        
	        findData.setPassword(userInfo[1]) ;
	        session = request.getSession();
	        session.setAttribute("memberpassword", findData); 
	        
			return(mapping.findForward("success"));
			}
			
		}
	}

