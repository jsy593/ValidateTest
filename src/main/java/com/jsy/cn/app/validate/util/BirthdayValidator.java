package com.jsy.cn.app.validate.util;

import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.jsy.cn.app.validate.service.ValidateBirthday;

public class BirthdayValidator implements ConstraintValidator<ValidateBirthday,Date>{

	public void initialize(ValidateBirthday constraintAnnotation) {
		System.out.println(constraintAnnotation.values());
		
	}

	public boolean isValid(Date value, ConstraintValidatorContext context) {
		if(value == null){
			return false;
		}else if(value.after(new Date())){
			return false;
		}else{
			return true;
		}
	}

}
