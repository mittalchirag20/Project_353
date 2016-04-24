package controller;

import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "user")
@SessionScoped
public class UserController {

    String flag = "" ,ck;

    public UserController() {
    }

    

}
