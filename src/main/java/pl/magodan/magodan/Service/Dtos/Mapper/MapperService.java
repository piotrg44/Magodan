package pl.magodan.magodan.Service.Dtos.Mapper;

import org.springframework.stereotype.Service;
import pl.magodan.magodan.Model.Group;
import pl.magodan.magodan.Model.Task;
import pl.magodan.magodan.Model.User;
import pl.magodan.magodan.Service.Dtos.TaskResponse;
import pl.magodan.magodan.Service.Dtos.UserResponse;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class MapperService {
    public UserResponse userToUserResponse(User user) {
        return UserResponse
                .builder()
                .name(user.getName())
                .role(user.getRole())
                .tasks(user.getTasks().stream().map(Task::getId).collect(Collectors.toList()))
//                .groups(user.getGroups().stream().map(Group::getId).collect(Collectors.toList()))
                .build();
    }

    public List<UserResponse> usersToUsersResponse(List<User> users) {
        return users.stream().map(user ->UserResponse
                .builder()
                .name(user.getName())
                .role(user.getRole())
                .tasks(user.getTasks().stream().map(Task::getId).collect(Collectors.toList()))
//                .groups(user.getGroups().stream().map(Group::getId).collect(Collectors.toList()))
                .build()).collect(Collectors.toList());
    }

    public TaskResponse taskToTaskResponse(Task task) {
        return TaskResponse
                .builder()
                .description(task.getDescription())
                .howManyTimesADay(task.getHowManyTimesADay())
                .isDaily(task.isDaily())
                .ownerId(task.getOwner().getId())
                .participantsId(task.getParticipants().stream().map(User::getId).collect(Collectors.toList()))
                .title(task.getTitle())
                .build();
    }

    public List<TaskResponse> tasksToTasksResponse(List<Task> tasks) {
        return tasks.stream().map(task -> TaskResponse
                .builder()
                .description(task.getDescription())
                .howManyTimesADay(task.getHowManyTimesADay())
                .isDaily(task.isDaily())
                .ownerId(task.getOwner().getId())
                .participantsId(task.getParticipants().stream().map(User::getId).collect(Collectors.toList()))
                .title(task.getTitle())
                .build()).collect(Collectors.toList());
    }
}
