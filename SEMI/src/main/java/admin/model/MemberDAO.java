package admin.model;

import java.sql.SQLException;
import java.util.List;

import admin.domain.MemberVO;

public interface MemberDAO {

   // ëª¨ë?? ?????? ì¡°í?????? ë©?????
   List<MemberVO> SelectAll_member() throws SQLException;
   
}
