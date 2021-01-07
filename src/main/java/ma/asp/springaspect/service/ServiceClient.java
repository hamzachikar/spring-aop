package ma.asp.springaspect.service;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import ma.asp.springaspect.beans.Client;
import ma.asp.springaspect.beans.Compte;
import ma.asp.springaspect.beans.IClient;
import ma.asp.springaspect.logging.LoggingHandler;

@Service
public class ServiceClient implements IServiceClient{
	private IClient clientProxy;
	public ServiceClient() {
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("SpringContext.xml");
		clientProxy=(IClient) ctx.getBean("clientProxy");
	}
	@Override
	public void retirer(double montant) {
		
		clientProxy.retirer(montant);
	}

	@Override
	public void verser(double montant) {
		clientProxy.verser(montant);
	}

}
