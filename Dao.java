@Repository
public class UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    public User findById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    public List<User> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from User", User.class).list();
    }

    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    public void delete(Long id) {
        User user = findById(id);
        if (user != null) sessionFactory.getCurrentSession().delete(user);
    }
}
