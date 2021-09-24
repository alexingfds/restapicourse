/**
 * 
 */
package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author richardson
 *
 */
@RestController
public class HelloCotroller {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return  "Hi";
	}

}
