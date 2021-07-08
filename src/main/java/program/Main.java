package program;

import models.Author;
import models.Book;
import models.Role;
import models.User;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class Main {
    public static void main(String[] args) {

        System.out.println("Гарна погода!");
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//
//        Role role = new Role("admin");
//        session.save(role);
//
//        User user = new User("Славік");
//        user.getRoles().add(role);
//        //Save the employee in database
//        session.save(user);
//
//        session.getTransaction().commit();
//        session.close();

    }
}
