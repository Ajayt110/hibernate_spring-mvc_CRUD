package spring_mvc_web_demo3_validations.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomCodeConstraintValidator implements ConstraintValidator<CustomCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CustomCode customCode) {
		coursePrefix =customCode.value();
	}
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

		boolean result = theCode.startsWith(coursePrefix);
		
		return result;
	}

}
