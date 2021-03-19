package net.codejava;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AppController {


	
	@Autowired
	private CoinRepository CoinRepo;
	
	@Autowired
	private BuyerRepository BuyerRepo;
	
	@Autowired
	private UserServices service;
	
	@GetMapping("")
	public ModelAndView viewHomePage() {
		return new ModelAndView("index");
	}

	@GetMapping("/register")
	public ModelAndView showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return new ModelAndView("signup_form");
	}
	
	@PostMapping("/process_register")
	public ModelAndView processRegister(User user, HttpServletRequest request) 
			throws UnsupportedEncodingException, MessagingException {
		service.register(user, getSiteURL(request));		
		return new ModelAndView("ver");
	}
	
	private String getSiteURL(HttpServletRequest request) {
		String siteURL = request.getRequestURL().toString();
		return siteURL.replace(request.getServletPath(), "");
	}	
	
	@GetMapping("/verify")
	public ModelAndView verifyUser(@Param("code") String code) {
		if (service.verify(code)) {
			return new ModelAndView("verify_success");
		} else {
			return new ModelAndView("verify_fail");
		}
	}
	
	
	@GetMapping("/buyfg")
	public ModelAndView listBuyers(Model model) {
		List<Coin> listBuyers = CoinRepo.findAll();
		model.addAttribute("listBuyers", listBuyers);
		
		return new ModelAndView("buy");
	}
	
	
	@GetMapping("/Coinregistration")
	public ModelAndView CoinRegistration(Model model) {
		
		
		return new ModelAndView("CoinReg");
	}
	@PostMapping("/coin_registeration")
	public ModelAndView CoinRegister(Coin Coin) {
		
		CoinRepo.save(Coin);
		
		return new ModelAndView("index");
	}
	
	@GetMapping("/BuyerRegistration")
	public ModelAndView BuyerRegistration(Model model) {
			
			
			return new ModelAndView("BuyerRegistration");
			}
		
		@PostMapping("/buyer1")
		public ModelAndView BuyerRegister(Buyer Buyer) {
			
			
			
			BuyerRepo.save(Buyer);
			
			return new ModelAndView("successBuy");
		}
}
