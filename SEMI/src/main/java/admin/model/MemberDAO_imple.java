package admin.model;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import admin.domain.MemberVO;
import util.security.AES256;
import util.security.SecretMyKey;
import util.security.Sha256;

public class MemberDAO_imple implements MemberDAO {

   private DataSource ds;  // DataSource ds ?? ????ì¹??°ìº£?? ??ê³µí???? DBCP(DB Connection Pool)?´ë??. 
   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   private AES256 aes;
   
   // ???±ì??
   public MemberDAO_imple() {
      
      try {
         Context initContext = new InitialContext();
          Context envContext  = (Context)initContext.lookup("java:/comp/env");
          ds = (DataSource)envContext.lookup("jdbc/semioracle");
          
          aes = new AES256(SecretMyKey.KEY);
          // SecretMyKey.KEY ?? ?°ë¦¬ê°? ë§??? ???¸í??/ë³µí?¸í?? ?¤ì?´ë??.
          
      } catch(NamingException e) {
         e.printStackTrace();
      } catch(UnsupportedEncodingException e) {
         e.printStackTrace();
      }
   }
   
   
   // ?¬ì?©í?? ?????? ë°??©í???? close() ë©????? ???±í??ê¸?
   private void close() {
      try {
         if(rs    != null) {rs.close();     rs=null;}
         if(pstmt != null) {pstmt.close(); pstmt=null;}
         if(conn  != null) {conn.close();  conn=null;}
      } catch(SQLException e) {
         e.printStackTrace();
      }
   }// end of private void close()---------------
   
   
   // ëª¨ë?? ?????? ì¡°í?????? ë©?????
   @Override
   public List<MemberVO> SelectAll_member() throws SQLException {
      
      List<MemberVO> memberList = null;
      
      try {
           conn = ds.getConnection();
           
           String sql = " select m_id, m_name, m_email, m_mobile, m_postcode, m_address, m_detail_address, m_extra, m_gender, m_birth, m_point, m_register, m_lastpwd, m_status, m_idle "
                     + " from tbl_member ";
           
           pstmt = conn.prepareStatement(sql);
           
           rs = pstmt.executeQuery();
           
           if(rs.next()) {
              
              memberList = new ArrayList<>();
              
              MemberVO member = new MemberVO();
              
              member.setM_id(rs.getString("m_id"));
              member.setM_name(rs.getString("m_name"));
              member.setM_email(rs.getString("m_email"));
              member.setM_mobile(rs.getString("m_mobile"));
              member.setM_postcode(rs.getString("m_postcode"));
              member.setM_address(rs.getString("m_address"));
              member.setM_detail_address(rs.getString("m_detail_address"));
              member.setM_extra(rs.getString("m_extra"));
              member.setM_gender(rs.getString("m_gender"));
              member.setM_birth(rs.getString("m_birth"));
              member.setM_point(rs.getInt("m_point"));
              member.setM_register(rs.getString("m_register"));
              member.setM_lastpwd(rs.getString("m_lastpwd"));
              member.setM_status(rs.getInt("m_status"));
              member.setM_idle(rs.getInt("m_idle"));
              
              memberList.add(member);
           }
           
          
           
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         close();
      }
      
      return memberList;
   }// end of public boolean idDuplicateCheck(String userid) throws SQLException------

}







