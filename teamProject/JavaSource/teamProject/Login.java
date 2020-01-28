package teamProject;

import javax.servlet.http.* ;

import org.apache.struts.action.* ;

public class Login extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception{
		LoginInfoBean loginData = (LoginInfoBean)form;
		LoginDataBean logindb = new LoginDataBean();
		String memberID, memberPW ;
		
		String[] userInfo = new String[2];
		HttpSession session ;
		
		memberID = loginData.getMemberID();
		memberPW = loginData.getMemberPW();
		
		userInfo = logindb.checkUserAccount(memberID, memberPW);
		
		if(userInfo[1].equals("-1"))
			return mapping.findForward("mismatch");
		else{
			session = request.getSession();
			session.setAttribute("userName", userInfo[0]);
			session.setAttribute("id", memberID);
			session.setAttribute("permission", userInfo[1]);

			return(mapping.findForward("success"));
		}
		
	}
}

