package com.formvalidate.validationform.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.formvalidate.validationform.Entities.LoginData;

import jakarta.validation.Valid;

@Controller
public class FormController {

    //form handler 
    @GetMapping("/form")
    public String openForm(Model m){
        System.out.println("Opening Form");
        m.addAttribute("loginData", new LoginData());
        return "form";
    }

    //form process handler
    @PostMapping("process")
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result){
        if(result.hasErrors()){
            System.out.println(result);
            return "form";
        }
        System.out.println(loginData);
        return "success";
    }
}
