package pl.magodan.magodan.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.magodan.magodan.Service.Dtos.TaskResponse;
import pl.magodan.magodan.Service.TaskService;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {
    TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskResponse>> getTasks() {
        return new ResponseEntity<>(taskService.findAll(), HttpStatus.FOUND);
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<TaskResponse> getTaskById(@PathVariable long id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.FOUND);
    }

    @GetMapping("/task/{id}/participants")
    public ResponseEntity<List<Long>> getAllTaskParticipants(@PathVariable long id) {
        return new ResponseEntity<>(taskService.findById(id).getParticipantsId(), HttpStatus.FOUND);
    }
}
