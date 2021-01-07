package com.itqpleyva.abstractfactorypattern;

import com.itqpleyva.abstractfactorypattern.Applications.Application;
import com.itqpleyva.abstractfactorypattern.factories.GuiFactory;
import com.itqpleyva.abstractfactorypattern.factories.MacFactory;
import com.itqpleyva.abstractfactorypattern.factories.WindowsFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryPatternApplication {

	static GuiFactory factory;
	static Application app;

	public static void main(final String[] args) {
		SpringApplication.run(AbstractFactoryPatternApplication.class, args);

		String os_name = System.getProperty("os.name").toLowerCase();

		if (os_name.contains("mac")) {

			factory = new MacFactory();
			 app = new Application(factory);
		}
		else{

			factory = new WindowsFactory();
			 app = new Application(factory);
		}
		 app.paint();
	}

}
