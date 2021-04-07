package pl.magodan.magodan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.magodan.magodan.Model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
