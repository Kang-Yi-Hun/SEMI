package admin.model;

import java.sql.SQLException;
import java.util.List;

import admin.domain.MemberVO;

public interface MemberDAO {

   // 모�?? ?????? 조�?????? �?????
   List<MemberVO> SelectAll_member() throws SQLException;
   
}
