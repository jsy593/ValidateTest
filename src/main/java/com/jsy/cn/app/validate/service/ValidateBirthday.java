package com.jsy.cn.app.validate.service;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.PARAMETER;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.jsy.cn.app.validate.util.BirthdayValidator;

@Target( { METHOD, FIELD,PARAMETER, ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=BirthdayValidator.class)
@Documented
public @interface ValidateBirthday {
	String message() default "message";
	Class<?>[] groups() default {};
	Class<? extends Payload> [] payload() default {};
	String values();
}
