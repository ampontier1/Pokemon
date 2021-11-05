/**
 * @author alexanderpontier - ampontier1
 * CIS175 - Spring 2021
 * Nov 4, 2021
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Monster;
import dmacc.beans.Types;

@Configuration
public class BeanController {
	
	@Bean
	public Monster monster() {
		Monster bean = new Monster();
		return bean;
	}
	
	@Bean
	public Types types() {
		Types bean = new Types();
		return bean;
	}

}
