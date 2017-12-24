package affiliate;

public class deliveryClass {

    String password;
    String cstate;
    String caddress1;
    String orderID;
    String czipCode;
    String mainC;
    String rpassword;
    String cname;
    String cphoneNo;
    String caddress2;
    String ccity;
    String userID;
    String cpaymentStatus;

    public deliveryClass() {
    }

    public deliveryClass(String password, String cstate, String caddress1, String orderID, String czipCode, String mainC, String rpassword, String cname, String cphoneNo, String caddress2, String ccity, String userID, String cpaymentStatus) {
        this.password = password;
        this.cstate = cstate;
        this.caddress1 = caddress1;
        this.orderID = orderID;
        this.czipCode = czipCode;
        this.mainC = mainC;
        this.rpassword = rpassword;
        this.cname = cname;
        this.cphoneNo = cphoneNo;
        this.caddress2 = caddress2;
        this.ccity = ccity;
        this.userID = userID;
        this.cpaymentStatus = cpaymentStatus;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public String getCaddress1() {
        return caddress1;
    }

    public void setCaddress1(String caddress1) {
        this.caddress1 = caddress1;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCzipCode() {
        return czipCode;
    }

    public void setCzipCode(String czipCode) {
        this.czipCode = czipCode;
    }

    public String getMainC() {
        return mainC;
    }

    public void setMainC(String mainC) {
        this.mainC = mainC;
    }

    public String getRpassword() {
        return rpassword;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphoneNo() {
        return cphoneNo;
    }

    public void setCphoneNo(String cphoneNo) {
        this.cphoneNo = cphoneNo;
    }

    public String getCaddress2() {
        return caddress2;
    }

    public void setCaddress2(String caddress2) {
        this.caddress2 = caddress2;
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getCpaymentStatus() {
        return cpaymentStatus;
    }

    public void setCpaymentStatus(String cpaymentStatus) {
        this.cpaymentStatus = cpaymentStatus;
    }
}
