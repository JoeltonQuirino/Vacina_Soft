package br.com.ifpb.ads.daca.vacinasoft.entities;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author MarkusPatriota
 */

@Entity
@Table(name="user_systems_tbl")
public class UserSystems extends AbstractEntity implements Serializable{
    
    @Column(name="username", nullable = false,unique = true)
    private String username;
    
    @Column(name="userpassword",nullable = false)
    private String userpassword;
    
    @Column(name="grupsUsers",nullable = false)
    private String grupsUsers;

    public UserSystems() {
    }

    public String getGrupsUsers() {
        return grupsUsers;
    }

    public void setGrupsUsers(String grupsUsers) {
        this.grupsUsers = grupsUsers;
    }
            
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUserpassword() {
        return userpassword;
    }
    
    public void setUserpassword(String userpassword) {
        
        MessageDigest md;
        String passwordSHA256 = userpassword;
        try {
            md = MessageDigest.getInstance("SHA-256");
            final byte[] digest = md.digest(userpassword.getBytes("UTF-8"));
            BigInteger hash = new BigInteger(1, digest);
            passwordSHA256 = hash.toString(16);
            String teste = new String(digest);
            while (passwordSHA256.length() < 32)
            {
                passwordSHA256 = "0" + passwordSHA256;
            }
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UserSystems.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UserSystems.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.userpassword = passwordSHA256;
    }

    @Override
    public String toString() {
        return "UserSystems:" + "username=" + username + ", grupsUsers=" + grupsUsers;
    }
    
}
