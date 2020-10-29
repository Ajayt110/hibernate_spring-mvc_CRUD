package spring.webapplication.others;

	import java.util.HashMap;
	import java.util.Map;

	import org.springframework.stereotype.Component;

	import spring.webapplication.dto.User;

	@Component
	public class UserCheck {

		public static Map<String, String> validate(User user) {
			Map<String, String> erMsg = new HashMap<String, String>();
			if (user.getFullname().isEmpty()) {
				erMsg.put("fullnameError", "Enter name");
			}

			if (user.getEmail().isEmpty()) {
				erMsg.put("emailError", "Enter valid Email");
			}

			if (user.getMobile().isEmpty()) {
				erMsg.put("mobileError", "Enter mobile number");
			}

			if (user.getPassword().isEmpty()) {
				erMsg.put("passwordError", "Enter password");
			}
			return erMsg;
		}

	}

