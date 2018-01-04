package org.jboss.as.quickstarts.helloworld;

import java.util.List;
import java.util.ArrayList;
/**
 * A simple CDI service which is able to say hello to someone
 * 
 * @author Pete Muir
 * 
 */
public class HelloService {

   String createHelloMessage(String name) {
      List<String> names = new ArrayList();
      int i = 0;
      while (i < 10) {
         names.add("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
      }
      return "Hello " + name + "!";
  }

}
