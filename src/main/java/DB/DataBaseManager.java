package DB;

import Model.Result;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class DataBaseManager {
    private static Deque<Result> resultList;

    public synchronized static Deque<Result> loadData() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        resultList = new ArrayDeque<Result>(session.createQuery("from Result").getResultList());
        return resultList;
    }

    public synchronized static void save(Result result) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.save(result);
        session.beginTransaction().commit();
        session.close();
    }

    public synchronized static void clearData() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Result");
        query.executeUpdate();
        session.getTransaction().commit();
        session.clear();
        resultList = new ArrayDeque<>();
    }
}
