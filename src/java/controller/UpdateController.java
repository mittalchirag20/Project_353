/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LoginDAOImpl;
import dao.LoginDAO;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import model.LoginBean;

/**
 *
 * @author admin
 */
@ManagedBean
@SessionScoped
public class UpdateController {

    // This corresponds to the response to be sent back to the client
    private String name;
    private LoginBean theModel;
    private String updateStatus;

    public UpdateController() {
        //theModel = new LoginBean();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public LoginBean getTheModel() {
        return theModel;
    }

    public void setTheModel(LoginBean theModel) {
        this.theModel = theModel;
    }

    public String getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    
    
}
