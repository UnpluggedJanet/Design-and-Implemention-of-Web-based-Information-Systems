package teamProject;
import com.microsoft.sqlserver.jdbc.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class LoginDataBean {
	public String[] checkUserAccount(String memberID, String memberPW){
		String queryResult[] = new String[2];
		queryResult[0] = null;
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

			con.setAutoCommit(true);

			cstmt = con.prepareCall("{call getAccountInformation(?,?)}");
			cstmt.setString(1, memberID);
			cstmt.setString(2, memberPW);
			rs = cstmt.executeQuery();
			
			while(rs.next()){
				queryResult[0] = rs.getString("memberName"); 
				queryResult[1] = rs.getString("memberPM"); 
				
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