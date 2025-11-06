import jakarta.persistence.EntityManager;

public class JpaDemoMain {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            UserClassHibernate user = new UserClassHibernate("Alice");
            em.getTransaction().begin();
            em.persist(user); // save(user)
            em.getTransaction().commit();
            System.out.println("User saved: " + user.getId());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            JPAUtil.close();
        }

    }
}
