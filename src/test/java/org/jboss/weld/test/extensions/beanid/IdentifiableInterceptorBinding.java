package org.jboss.weld.test.extensions.beanid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.interceptor.InterceptorBinding;

import org.jboss.weld.extensions.beanid.RequiresIdentification;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@InterceptorBinding
@RequiresIdentification
public @interface IdentifiableInterceptorBinding
{
   
}