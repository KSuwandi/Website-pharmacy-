/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;
import test.HibernateUtil;
import pojo.Admin;
/**
 *
 * @author asus
 */
public class DAOAdmLogin {
        public List<Admin> getBy(String aName, String aEmail, String aPass ){
        Admin adm = new Admin();
        List<Admin> admin = new ArrayList();
        
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query que = session.createQuery("from Admin where useradm=:aName "
                    + "AND emailadm = :aEmail AND passadm = :aPass");
            que.setString("aName", aName);
            que.setString("aEmail", aEmail);
            que.setString("aPass", aPass);
            adm = (Admin) que.uniqueResult();
            admin = que.list();
            
            trans.commit();
        }catch (Exception e){
            System.out.println("error "+e);
        }
        return admin;
    };

}
