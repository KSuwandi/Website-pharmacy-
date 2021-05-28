/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;
import pojo.User;
import test.HibernateUtil;

/**
 *
 * @author asus
 */
public class DAOLogin {
    
    public List<User> getBy(String uName, String uPass){
        User us = new User();
        List<User> user = new ArrayList();
        
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query que = session.createQuery("from User where usernameu="
            + " :uName AND passuser = :uPass");
            que.setString("uName", uName);
            que.setString("uPass", uPass);
            us = (User) que.uniqueResult();
            user = que.list();
            
            trans.commit();
        }catch (Exception e){
            System.out.println("error "+e);
        }
        return user;
    };
    
}
