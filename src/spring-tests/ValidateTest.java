package springTests;

import javax.validation.constraints.*;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.*;
import org.springframework.validation.ValidationUtils;;

public class ValidateTest {

	public static void main(String[] args) {
		ValidateTest v = new ValidateTest();

		v.validateSetPreferences();
	}

	/**
	 * Messing around with spring validation stuff. 
	 * 
	 * Couldn't find a simpler example of using BeanProperty_BindingResult
	 * 
	 * @param context
	 */
	public void validateSetPreferences() {
//		MessageContext messages = context.getMessageContext();
		
		ScottFormBackingObject command = new ScottFormBackingObject ();
		command.address="asdfasdfasdkfhaksdf aksdfj haskdjfha ksjdhfakdjhdjahkdj fahkdfjhaksd ";
		
//		PropertyE
		
		BeanPropertyBindingResult errors = new BeanPropertyBindingResult(command, "registration");

		//		preferencesValidator.validate(command, errors);
		
//		Errors errors = null;
		 ValidationUtils.rejectIfEmpty(errors, "dfasdf", "sadf");
		
//		if(errors.hasErrors()) {
//			for(FieldError error: errors.getFieldErrors()){
//				messages.addMessage(new MessageBuilder().error().source(error.getField())
//						.defaultText(error.getDefaultMessage()).build());	
//			}
//		} 
	}
	
	class ScottFormBackingObject {
		@NumberFormat
		String name;
		
		@Size (max=40)
		String address;
		
	}
	
}
