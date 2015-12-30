package com.ismail.spring.greffons;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculesLoggingAspect {

	private Log log = LogFactory.getLog(this.getClass());

	@Before("execution(* *.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		log.info("Methode" + joinPoint.getSignature().getName() + "invoquée par" + Arrays.toString(joinPoint.getArgs()));
	}
}
