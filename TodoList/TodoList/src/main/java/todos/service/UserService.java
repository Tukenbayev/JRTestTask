package todos.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional("todosTransactionManager")
public class UserService {

}
