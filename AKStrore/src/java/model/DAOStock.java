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


/**
 *
 * @author asus
 */
public class DAOStock {
    
    

        public String addStok(Stock st) {
            Transaction trans = null;
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                trans = session.beginTransaction();
                session.save(st);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error" + e);
            }
            return "restock.xhtml";
        }

       
        public void deleteStock(int ids) {

            Transaction trans = null;
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                trans = session.beginTransaction();
                Stock stk = (Stock) session.load(Stock.class, new Integer(ids));
                session.delete(stk);
                trans.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void updateStock(Stock stk) {
            Transaction trans = null;
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                trans = session.beginTransaction();
                session.update(stk);
                trans.commit();

            } catch (Exception e) {

            }
        }

        public List<Stock> getStock(int idss) {
            //system.out.println("nilai ID " + idp);
            Stock stk = new Stock();
            List<Stock> lstk = new ArrayList();

            Transaction trans = null;
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {

                trans = session.beginTransaction();
                Query query
                        = session.createQuery("FROM Stock where id = :idstk");
                query.setInteger("idstk", idss);
                stk = (Stock) query.uniqueResult();
                lstk = query.list();
                trans.commit();
            } catch (Exception e) {
                System.out.println("error" + e);
            }
            return lstk;
        }

        public List<Stock> retrieviewStock() {
            List stud = new ArrayList();
            Stock studl = new Stock();
            Transaction trans = null;
            Session session = HibernateUtil.getSessionFactory().openSession();
            try {
                trans = session.beginTransaction();
                Query query = session.createQuery("from Stock");
                stud = query.list();
                stud.add(studl.getIdstk());
                stud.add(studl.getNamastock());
                stud.add(studl.getTypestock());
                stud.add(studl.getPricestock());
                stud.add(studl.getJmlstock());
                stud.add(studl.getExpstock());

                trans.commit();
            } catch (Exception e) {

            }
            return stud;
        }
        
         public List<Stock> retrieveStock(){
        Transaction transObj = null;
        Session sessionObj = HibernateUtil.getSessionFactory().openSession();
        List listStk = new ArrayList();
        try {
            transObj = sessionObj.beginTransaction();
            Query query = sessionObj.createQuery("from Stock");
            listStk = query.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            transObj.commit();
        }
        return listStk;
    }

        
}
