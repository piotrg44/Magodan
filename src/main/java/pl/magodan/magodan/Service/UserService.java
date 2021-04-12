package pl.magodan.magodan.Service;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pl.magodan.magodan.Model.*;
import pl.magodan.magodan.Repository.GroupRepository;
import pl.magodan.magodan.Repository.TaskRepository;
import pl.magodan.magodan.Repository.UserGroupRepository;
import pl.magodan.magodan.Repository.UserRepository;
import pl.magodan.magodan.Service.Dtos.Mapper.MapperService;
import pl.magodan.magodan.Service.Dtos.UserResponse;

import javax.swing.*;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    UserRepository userRepository;
    TaskRepository taskRepository;
    MapperService mapperService;
    UserGroupRepository userGroupRepository;
    GroupRepository groupRepository;

    @Bean
    public void initTaskAndUser() {
        User user =
                User
                        .builder()
                        .username("User1")
                        .role(Role.OWNER)
                        .build();
        userRepository.save(user);

        User user2 =
                User
                        .builder()
                        .username("User2")
                        .role(Role.USER)
                        .build();
        userRepository.save(user2);

        User user3 =
                User
                        .builder()
                        .username("User3")
                        .role(Role.USER)
                        .build();
        userRepository.save(user3);

        Task task =
                Task
                        .builder()
                        .Description("Task1")
                        .owner(user)
                        .howManyTimesADay(3)
                        .isDaily(false)
                        .participants(List.of(user2, user3))
                        .title("Wyjdz z psem.")
                        .build();
        taskRepository.save(task);

        Group group1 =
                Group
                        .builder()
                        .numberOfUsers(3)
                        .build();
        groupRepository.save(group1);

        UserGroup groupFamilyOne =
                UserGroup
                        .builder()
                        .user(user)
                        .group(group1)
                        .build();

        userGroupRepository.save(groupFamilyOne);

        

    }

    public List<UserResponse> findAll() {
        return mapperService.usersToUsersResponse(userRepository.findAll());
    }
}
