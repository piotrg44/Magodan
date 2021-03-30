package pl.magodan.magodan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.magodan.magodan.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
