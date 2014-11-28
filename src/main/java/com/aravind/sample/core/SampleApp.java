/**
 * 
 */
package com.aravind.sample.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author aravind
 *
 */
@EnableAutoConfiguration
@ComponentScan
public class SampleApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SampleApp.class, args);
	}

}
