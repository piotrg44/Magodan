package pl.magodan.magodan.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.magodan.magodan.Model.Task;
import pl.magodan.magodan.Repository.TaskRepository;
import pl.magodan.magodan.Service.Dtos.Mapper.MapperService;
import pl.magodan.magodan.Service.Dtos.TaskResponse;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class TaskService {
    TaskRepository taskRepository;
    MapperService mapperService;

    public List<TaskResponse> findAll() {
        return mapperService.tasksToTasksResponse(taskRepository.findAll());
    }

    public TaskResponse findById(long id) {
        return mapperService.taskToTaskResponse(taskRepository.findById(id).orElseThrow(NoSuchElementException::new));
    }
}
