@Service
@Transactional
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void createUser(User user) {
        userDAO.save(user);
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(Long id) {
        userDAO.delete(id);
    }
}
