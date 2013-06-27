/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.bjug.spring.customns;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 *
 * @author Vlad Untu
 */
public class CustomNsHandler extends NamespaceHandlerSupport  {

    @Override
    public void init() {
        registerBeanDefinitionParser("configuration", new ConfigurationDefinitionParser());
    }
    
}
