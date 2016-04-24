/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author it3530108
 */
public class LoginBean {
    // These correspond to the form elements

    private String firstName;
    private String lastName;

    private String userID;
    private String password;
    private String confirmPwd;
    private String emailID;
    private String street;

    private String city;
    private String state;
    private String country;
    private String securityQue;
    private String securityAns;
    private String securityQue1;
    private String securityAns1;

    public LoginBean() {
    }

    public LoginBean(String firstName, String lastName, String userID, String password, String confirmPwd, String emailID,String street,String city,String state,String country, String securityQue, String securityAns, String securityQue1, String securityAns1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.password = password;
        this.confirmPwd = confirmPwd;
        this.emailID = emailID;
        this.securityQue = securityQue;
        this.securityAns = securityAns;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the confirmPwd
     */
    public String getConfirmPwd() {
        return confirmPwd;
    }

    /**
     * @param confirmPwd the confirmPwd to set
     */
    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    /**
     * @return the emailID
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * @param emailID the emailID to set
     */
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    /**
     * @return the securityQue
     */
    public String getSecurityQue() {
        return securityQue;
    }

    /**
     * @param securityQue the securityQue to set
     */
    public void setSecurityQue(String securityQue) {
        this.securityQue = securityQue;
    }

    /**
     * @return the securityAns
     */
    public String getSecurityAns() {
        return securityAns;
    }

    /**
     * @param securityAns the securityAns to set
     */
    public void setSecurityAns(String securityAns) {
        this.securityAns = securityAns;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the securityQue1
     */
    public String getSecurityQue1() {
        return securityQue1;
    }

    /**
     * @param securityQue1 the securityQue1 to set
     */
    public void setSecurityQue1(String securityQue1) {
        this.securityQue1 = securityQue1;
    }

    /**
     * @return the securityAns1
     */
    public String getSecurityAns1() {
        return securityAns1;
    }

    /**
     * @param securityAns1 the securityAns1 to set
     */
    public void setSecurityAns1(String securityAns1) {
        this.securityAns1 = securityAns1;
    }

    /**
     * @return the clientName
     */
}
