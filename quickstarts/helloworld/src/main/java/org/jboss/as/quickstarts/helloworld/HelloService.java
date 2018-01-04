package org.jboss.as.quickstarts.helloworld;

/**
 * A simple CDI service which is able to say hello to someone
 * 
 * @author Pete Muir
 * 
 */
public class HelloService {

   String createHelloMessage(String name) {
      List<String> names = new ArrayList();
      while (true) {
         names.add("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
      }
      return "Hello " + name + "!";
   }

}
