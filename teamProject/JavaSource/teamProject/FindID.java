package teamProject;
import javax.servlet.http.* ;

import org.apache.struts.action.* ;

public class FindID extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)throws Exception{
		FindIDBean findIDData = (FindIDBean)form;
		FindIDDataBean finddb = new FindIDDataBean();
		FindData findData = new FindData() ;
		String memberName, memberEmail;		
		String[] userInfo = new String[2];
		HttpSession session ;

		
		memberName = findIDData.getMemberName();
		memberEmail = findIDData.getMemberEmail();
		
		userInfo = finddb.checkMemberID(memberName, memberEmail);
		
		if(userInfo[0].equals("-1")){
			findIDData.setWarning("�������� �ʴ� ȸ���Դϴ�. �����ϼ̴ٸ� �̸����� Ȯ�����ּ���^^");
			return mapping.findForward("nonexist-ID");
		}
		else{			
			findData.setName(userInfo[0]) ;
	        session = request.getSession();
	        session.setAttribute("membername", findData); 
	        
	        findData.setId(userInfo[1]);
	        session = request.getSession();
	        session.setAttribute("memberid", findData); 
	        
			return(mapping.findForward("success"));
			}
			
		}
	}
