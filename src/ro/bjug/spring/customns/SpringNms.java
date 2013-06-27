/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.bjug.spring.customns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Vlad Untu
 */
public class SpringNms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"ro/bjug/spring/customns/applicationContext.xml"} );
        
        Configuration config1 = context.getBean("config1", Configuration.class);
        
        Configuration config2 = context.getBean("config2", Configuration.class);
        
        System.out.println("User: "  + config1.getUser());
        System.out.println("Password: "  + config1.getPassword());
        System.out.println("Server: "  + config1.getServer());
    }
}
