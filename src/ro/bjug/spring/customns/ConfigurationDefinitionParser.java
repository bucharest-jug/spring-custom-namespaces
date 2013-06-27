/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.bjug.spring.customns;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 *
 * @author Vlad Untu
 */
class ConfigurationDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Configuration.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        builder.addPropertyValue("user", element.getAttribute("user"));
        builder.addPropertyValue("password", element.getAttribute("password"));
        builder.addPropertyValue("server", element.getAttribute("server"));
    }
}
