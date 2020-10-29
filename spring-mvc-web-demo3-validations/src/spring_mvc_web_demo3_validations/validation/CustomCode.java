package spring_mvc_web_demo3_validations.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CustomCodeConstraintValidator.class)
@Target( { ElementType.FIELD , ElementType.METHOD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomCode {
	
	public String value() default "MY";
	
	public String message() default "Coude shuold start with";
	
	public Class<?>[] groups() default{};
	
	public Class<? extends Payload>[] payload() default{};

}
