package admin.domain;

public class MemberVO {

   private String m_id;             // ???????´ë??
   private String m_pwd;                // ë¹?ë°?ë²??? (SHA-256 ???¸í?? ????)
   private String m_name;               // ????ëª?
   private String m_email;              // ?´ë??? (AES-256 ???¸í??/ë³µí?¸í?? ????)
   private String m_mobile;             // ?°ë?½ì? (AES-256 ???¸í??/ë³µí?¸í?? ????) 
   private String m_postcode;           // ?°í?¸ë???
   private String m_address;            // ì£¼ì??
   private String m_detail_address;      // ???¸ì£¼??
   private String m_extra;       // ì°¸ê???ëª?
   private String m_gender;             // ?±ë?   ?¨ì??:1  / ?¬ì??:2
   private String m_birth;           // ????????  
   private int m_point;                 // ?¬ì?¸í?? 
   private String m_register;        // ê°????¼ì?? 
   private String m_lastpwd;  // ë§?ì§?ë§??¼ë? ???¸ë?? ë³?ê²½í?? ??ì§?  
   private int m_status;                // ???????´ì??ë¬?   1: ?¬ì?©ê???(ê°???ì¤?) / 0:?¬ì?©ë???(????) 
   private int m_idle;                  // ?´ë©´??ë¬?      1: ????ì¤?  /  0: ?´ë©´ì¤?
                                      // ë§?ì§?ë§??¼ë? ë¡?ê·¸ì?? ?? ??ì§???ê°??? ???¬ì??ê°??¼ë? ë¶??? 1???? ì§??¬ì?¼ë©´ ?´ë©´?¼ë? ì§???  
   
   /////////////////////////////////////////////////////////////////////
   
   private boolean requirePwdChange = false;
   // ë§?ì§?ë§??¼ë? ???¸ë?? ë³?ê²½í?? ??ì§?ê°? ???¬ì??ê°??¼ë? ë¶??? 3ê°????? ì§??¬ì?¼ë©´ true
   // ë§?ì§?ë§??¼ë? ???¸ë?? ë³?ê²½í?? ??ì§?ê°? ???¬ì??ê°??¼ë? ë¶??? 3ê°????? ì§???ì§? ?????¼ë©´ false

   /////////////////////////////////////////////////////////////////////
   public String getM_id() {
      return m_id;
   }

   public void setM_id(String m_id) {
      this.m_id = m_id;
   }

   public String getM_pwd() {
      return m_pwd;
   }

   public void setM_pwd(String m_pwd) {
      this.m_pwd = m_pwd;
   }

   public String getM_name() {
      return m_name;
   }

   public void setM_name(String m_name) {
      this.m_name = m_name;
   }

   public String getM_email() {
      return m_email;
   }

   public void setM_email(String m_email) {
      this.m_email = m_email;
   }

   public String getM_mobile() {
      return m_mobile;
   }

   public void setM_mobile(String m_mobile) {
      this.m_mobile = m_mobile;
   }

   public String getM_postcode() {
      return m_postcode;
   }

   public void setM_postcode(String m_postcode) {
      this.m_postcode = m_postcode;
   }

   public String getM_address() {
      return m_address;
   }

   public void setM_address(String m_address) {
      this.m_address = m_address;
   }

   public String getM_detail_address() {
      return m_detail_address;
   }

   public void setM_detail_address(String m_detail_address) {
      this.m_detail_address = m_detail_address;
   }

   public String getM_extra() {
      return m_extra;
   }

   public void setM_extra(String m_extra) {
      this.m_extra = m_extra;
   }

   public String getM_gender() {
      return m_gender;
   }

   public void setM_gender(String m_gender) {
      this.m_gender = m_gender;
   }

   public String getM_birth() {
      return m_birth;
   }

   public void setM_birth(String m_birth) {
      this.m_birth = m_birth;
   }

   public int getM_point() {
      return m_point;
   }

   public void setM_point(int m_point) {
      this.m_point = m_point;
   }

   public String getM_register() {
      return m_register;
   }

   public void setM_register(String m_register) {
      this.m_register = m_register;
   }

   public String getM_lastpwd() {
      return m_lastpwd;
   }

   public void setM_lastpwd(String m_lastpwd) {
      this.m_lastpwd = m_lastpwd;
   }

   public int getM_status() {
      return m_status;
   }

   public void setM_status(int m_status) {
      this.m_status = m_status;
   }

   public int getM_idle() {
      return m_idle;
   }

   public void setM_idle(int m_idle) {
      this.m_idle = m_idle;
   }

   public boolean isRequirePwdChange() {
      return requirePwdChange;
   }

   public void setRequirePwdChange(boolean requirePwdChange) {
      this.requirePwdChange = requirePwdChange;
   }

   
      
   
   
   
    /////////////////////////////////////////////////////////////
    
   
   
}
