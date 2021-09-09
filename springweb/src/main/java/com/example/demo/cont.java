package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

@Controller
public class cont{
	@Autowired
	details d;
	@Autowired
	registerdetails r;
	/*@RequestMapping("home")
	public String home(@RequestParam("msg") String msg,HttpSession s)
	{
		s.setAttribute("msg", msg);
		return "home.jsp";
	}*/

	@RequestMapping("/home")
	public String home()
	{
		
		return "home.jsp";
	}
	@PostMapping("/laptopoperations")
    public String laptopop(@RequestParam("username") String user,@RequestParam("password") String password)
    {
		boolean user1= r.existsByusername(user);
		boolean pass=r.existsBypassword(password);
		System.out.println(user1);
		System.out.println(pass);
		if((user1) && (pass))
		{
		return "laptopoperations.jsp";
		}
		else
		{
			return "wrongcredentials.jsp";
		}
    }
	/*@RequestMapping("/laptop")
	public String laptop(@RequestParam("username") String user,@RequestParam("password") String password)
	{
		boolean user1= r.existsByusername(user);
		boolean pass=r.existsBypassword(password);
		System.out.println(user1);
		System.out.println(pass);
		if((user1) && (pass))
		{
		return "laptopdetails.jsp";
		}
		else
		{
			return "wrongcredentials.jsp";
		}
	}*/
	@RequestMapping("/laptopadd")
	public String laptopadd()
	{
		return "laptopdetails.jsp";
	}
	@PostMapping("/lap")
	public String laptopdetails(laptop lap)
	{
	  
		System.out.println(lap);
		d.save(lap);
		
		return "successful.jsp";
		
	}
	 @RequestMapping("/laptopavailable")    
	    public ModelAndView viewlaptop()
	 {   
		 ModelAndView m=new ModelAndView("laptopavailable.jsp");
		 Iterable<laptop> laptops=d.findAll();
		 System.out.println(laptops);
		 m.addObject("laptops",laptops);
	       return m; 
	    }    
	@RequestMapping("/register")
		public String register(register reg)
		{
			r.save(reg);
			return "home.jsp";
		}
	@PostMapping("/lapd")
	public String delete(int lapid)
	{
		d.deleteById(lapid);
		return "laptopoperations.jsp";
		
	}
	@PostMapping("/lapud")
	public String update(int lapid,int cost)
	{
		d.updateById(cost,lapid);
		return "laptopoperations.jsp";
	}

	
	
	
	
}
