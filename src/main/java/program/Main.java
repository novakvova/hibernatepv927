package program;

import models.User;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();

        //Add new User object
        User user = new User();
        user.setName("ivan");

        //Save the employee in database
        session.save(user);

        session.getTransaction().commit();
        session.close();

    }
}
