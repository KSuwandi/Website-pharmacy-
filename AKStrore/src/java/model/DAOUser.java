/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import test.HibernateUtil;
import pojo.Stock;
import pojo.User;

/**
 *
 * @author asus
 */
public class DAOUser {
    
    public String addUser(User usr){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(usr);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error" + e);
        }
        return "succes";
    }

    
    public void updateUser(User usri){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(usri);
            trans.commit();
            
        }catch (Exception e){
        
        }       
    }
    
    public void deleteUser(int idu){
    
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            User usre = (User) session.load(User.class, new Integer(idu));
            session.delete(usre);
            trans.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
   
     public List<User> getUsers (int idus){
        //system.out.println("nilai ID " + idp);
        User usr = new User();
        List<User> lusr = new ArrayList();
        
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            
            trans = session.beginTransaction();
            Query query = 
                    session.createQuery
            ("FROM User where id = :iduser");
            query.setInteger("iduser", idus);
            usr = (User) query.uniqueResult();
            lusr = query.list();
            trans.commit();
        }catch(Exception e){
            System.out.println("error"+e);
        }
        return lusr;
   }
    
    public List<User> retrieviewUser (){
        List stud = new ArrayList();
        User studl = new User();
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from User");
            stud = query.list();
            stud.add(studl.getUsernameu());
            stud.add(studl.getEmailuse());
            stud.add(studl.getPassuser());
            trans.commit();
        }catch (Exception e){
            
        }
    return stud;
    }
    
    public List<User> retrieveUser(){
        Transaction transObj = null;
        Session sessionObj = HibernateUtil.getSessionFactory().openSession();
        List listUsr = new ArrayList();
        try {
            transObj = sessionObj.beginTransaction();
            Query query = sessionObj.createQuery("from User");
            listUsr = query.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            transObj.commit();
        }
        return listUsr;
    }

    public List<User> getId(int idss) {
            //system.out.println("nilai ID " + idp);
            User usr = new User();
            List<User> lstk = new ArrayList();

            Transaction trans = null;
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {

                trans = session.beginTransaction();
                Query query
                        = session.createQuery("FROM Stock where id = :idstk");
                query.setInteger("idstk", idss);
                usr = (User) query.uniqueResult();
                lstk = query.list();
                trans.commit();
            } catch (Exception e) {
                System.out.println("error" + e);
            }
            return lstk;
        }

}
