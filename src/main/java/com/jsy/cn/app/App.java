package com.jsy.cn.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.jsy.cn.app.validate.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		        Person xiaoming = getPerson();
		         List<String> validate = validate(xiaoming);
		         for(String row:validate) {
		             System.out.println(row.toString());
		         };
		
		    }
		 
		     private static Person getPerson() {
		         Person Person = new Person();
		         Person.setName(null);
		         Person.setAddress("北京");
		         Person.setBirthday(new Date(1508871575305l));
		         return Person;
		     }
		 
		     private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		 
		     public static <T> List<String> validate(T t) {
		         Validator validator = factory.getValidator();
		         Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
		
		         List<String> messageList = new ArrayList<>();
		         for (ConstraintViolation<T> constraintViolation : constraintViolations) {
		             messageList.add(constraintViolation.getMessage());
		         }
		         return messageList;
		     }
}
