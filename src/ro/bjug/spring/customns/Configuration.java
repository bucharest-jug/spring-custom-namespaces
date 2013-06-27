/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.bjug.spring.customns;

/**
 *
 * @author Vlad Untu
 */
public class Configuration {
    private String user;
    private String password;
    private String server;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the server
     */
    public String getServer() {
        return server;
    }

    /**
     * @param server the server to set
     */
    public void setServer(String server) {
        this.server = server;
    }
    
    
}
