package edunovajp23;

import edunova.jp23.util.HibernateUtil;
import org.hibernate.Session;

public class Start {

    public static void main(String[] args) {

        Session s = HibernateUtil.getSession();
    }
}
