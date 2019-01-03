/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.LoginService;

/**
 *
 * @author Hp Gamers
 */
 @Controller
  @RequestMapping("/nextPage.htm")
public class LoginController extends SimpleFormController {
  
    private LoginService loginService;

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
    
    public LoginController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("nom");
        setSuccessView("nextPage");
        setFormView("login");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        Name nom=(Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        mv.addObject("bonjour",loginService.afficher(nom.getValu()));
        return mv;
    }
     
}
