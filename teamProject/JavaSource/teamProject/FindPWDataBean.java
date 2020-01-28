package teamProject;
import com.microsoft.sqlserver.jdbc.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class FindPWDataBean {
	public String[] checkMemberPW(String memberID, String memberName, String memberEmail){
		String queryResult[] = new String[2];
		queryResult[0] = "-1";
		queryResult[1] = "-1";
		
		Connection con = null;
		CallableStatement cstmt = null;

		ResultSet rs = null;
		

		try {
			SQLServerXADataSource ds = new SQLServerXADataSource();
			ds.setUser("team1");
			ds.setPassword("wh1rnjs2dlr3@");
			ds.setServerName("202.20.119.140");
			ds.setPortNumber(1433);
			ds.setDatabaseName("eLibrary1");
			con = ds.getConnection();
			
			cstmt = con.prepareCall("{call findPW(?,?,?)}");
			cstmt.setString(1, memberID);
			cstmt.setString(2, memberName);
			cstmt.setString(3, memberEmail);
			rs = cstmt.executeQuery();
			
			while(rs.next()){
				queryResult[0] = rs.getString("memberID"); 
				queryResult[1] = rs.getString("memberPW");
				}
				
				    
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(rs != null)
					try { rs.close();} catch(Exception e) {}
				if(cstmt != null)
					try { cstmt.close();} catch(Exception e) {}
				if(con != null)
					try { con.close();} catch(Exception e) {}
			}
			return queryResult;
		}

	}

