package affiliate;

public class AffiliateClass {
    String userID, password, rpassword, passwordHit, name, restaurantName, email,icno, phoneNo, address1, address2, city, state, zipCode;

    public AffiliateClass(String userID, String password, String rpassword, String passwordHit, String name, String restaurantName, String email, String icno, String phoneNo, String address1, String address2, String city, String state, String zipCode) {
        this.userID = userID;
        this.password = password;
        this.rpassword = rpassword;
        this.passwordHit = passwordHit;
        this.name = name;
        this.restaurantName = restaurantName;
        this.email = email;
        this.icno = icno;
        this.phoneNo = phoneNo;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    AffiliateClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getRpassword() {
        return rpassword;
    }

    public String getPasswordHit() {
        return passwordHit;
    }

    public String getName() {
        return name;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getEmail() {
        return email;
    }

    public String getIcno() {
        return icno;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRpassword(String rpassword) {
        this.rpassword = rpassword;
    }

    public void setPasswordHit(String passwordHit) {
        this.passwordHit = passwordHit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
