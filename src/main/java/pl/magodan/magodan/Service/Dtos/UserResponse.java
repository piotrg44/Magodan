package pl.magodan.magodan.Service.Dtos;

import lombok.Builder;
import lombok.Data;
import pl.magodan.magodan.Model.Role;
import pl.magodan.magodan.Service.Dtos.TaskResponse;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Data
@Builder
public class UserResponse {

    private String name;

    @Enumerated(EnumType.STRING)
    private Role role;

    private List<Long> tasks;

    private List<Long> groups;

}
