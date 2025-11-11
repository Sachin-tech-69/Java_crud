@Service
public class UserService {
    
    @Autowired
    private UserDAO userDAO;

    public void registerUser(User user) {
        userDAO.save(user);
    }
}
