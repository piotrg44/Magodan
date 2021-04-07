package pl.magodan.magodan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.magodan.magodan.Model.UserGroup;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
}
