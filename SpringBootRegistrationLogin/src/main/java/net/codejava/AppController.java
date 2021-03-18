package net.codejava;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private CoinRepository CoinRepo;
	
	@Autowired
	private BuyerRepository BuyerRepo;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		
		return "register_success";
	}
	
	
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
	
	@GetMapping("/buyfg")
	public String listBuyers(Model model) {
		List<Coin> listBuyers = CoinRepo.findAll();
		model.addAttribute("listBuyers", listBuyers);
		
		return "buy";
	}
	
	
	@GetMapping("/Coinregistration")
	public String CoinRegistration(Model model) {
		
		
		return "CoinReg";
	}
	@PostMapping("/coin_registeration")
	public String CoinRegister(Coin Coin) {
		
		CoinRepo.save(Coin);
		
		return "index";
	}
	
	@GetMapping("/BuyerRegistration")
	public String BuyerRegistration(Model model) {
			
			
			return "BuyerRegistration";
			}
		
		@PostMapping("/buyer1")
		public String BuyerRegister(Buyer Buyer) {
			
			
			
			BuyerRepo.save(Buyer);
			
			return "successBuy";
		}
}
