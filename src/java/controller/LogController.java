/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Hp Gamers
 */
 @Controller
 
public class LogController {
     @RequestMapping(method = RequestMethod.GET)
	public String initForm(ModelMap model){
		//return form view
        return "CustomerForm";
        }
}
