/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretest.dao;

import java.util.List;
import org.hibernate.Session;
import softwaretest.util.HibernateUtil;

/**
 *
 * @author mazinad
 */
public class GeneralDao<X> {

    private Class<X> type;

    public GeneralDao(Class<X> type) {
        this.type = type;
    }

    public X Create(X obj) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.save(obj);
        ss.getTransaction().commit();
        ss.close();
        return obj;
    }

    public X createUpdate(X obj) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.update(obj);
        ss.getTransaction().commit();
        ss.close();
        return obj;
    }

    public X initDelete(X obj) {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        ss.beginTransaction();
        ss.delete(obj);
        ss.getTransaction().commit();
        ss.close();
        return obj;
    }
    public List<X>findByAll(){
        Session ss=HibernateUtil.getSessionFactory().openSession();
       List<X>list=ss.createCriteria(type.getName()).list();
        return list;   
    }
    public X findbyId(String id){
        Session ss=HibernateUtil.getSessionFactory().openSession();
        X x=(X) ss.get(type, id);
        return x;
    }
}
