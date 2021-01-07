package ma.asp.springaspect.logging;


import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

import ma.asp.springaspect.beans.Client;

public class LoggingHandler implements MethodInterceptor{
	private Logger logger = Logger.getLogger(this.getClass().getName());
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("init method : "+invocation.getMethod().getName());
		if(invocation.getMethod().getName().equalsIgnoreCase("retirer")) {
			Client client=(Client)invocation.getThis();
			if(client.getCp().getSolde()<(double)invocation.getArguments()[0]) {
				logger.error("Method retirer cannot be resolved");
				return null;
			}
		}
		Object result = invocation.proceed();
		logger.info("end method : "+invocation.getMethod().getName());
		return result;
	}

}
