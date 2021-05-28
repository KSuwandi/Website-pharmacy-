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
import pojo.Admin;



/**
 *
 * @author asus
 */

public class DAOAdmin {

    public void NewAdmin(Admin adm){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(adm);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error" + e);
        }
    }

    
    public void updateAdmin(Admin adm){
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.update(adm);
            trans.commit();
            
        }catch (Exception e){
        
        }       
    }
    
    public void deleteAdmin(int ida){
    
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Admin adms = (Admin) session.load(Admin.class, new Integer(ida));
            session.delete(adms);
            trans.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
   
    public List<Admin> getAdmin (int ida){
        
        Admin adm = new Admin();
        List<Admin> ladm = new ArrayList();
        
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            
            trans = session.beginTransaction();
            Query query = 
                    session.createQuery
            ("FROM Admin where id = :idadm");
            query.setInteger("idadm", ida);
            adm = (Admin) query.uniqueResult();
            ladm = query.list();
            trans.commit();
        }catch(Exception e){
            System.out.println("error"+e);
        }
        return ladm;
   }
    
    public List<Admin> retrieviewAdmin (){
        List stud = new ArrayList();
        Admin studl = new Admin();
        Transaction trans = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Admin");
            stud = query.list();
            stud.add(studl.getUseradm());
            stud.add(studl.getEmailadm());
            stud.add(studl.getPassadm());
            
            trans.commit();
        }catch (Exception e){
            
        }
    return stud;
    }

    public List<Admin> retrieveAdmin(){
        Transaction transObj = null;
        Session sessionObj = HibernateUtil.getSessionFactory().openSession();
        List listAdm = new ArrayList();
        try {
            transObj = sessionObj.beginTransaction();
            Query query = sessionObj.createQuery("from Admin");
            listAdm = query.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            transObj.commit();
        }
        return listAdm;
    }

    
}
