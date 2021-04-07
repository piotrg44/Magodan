package pl.magodan.magodan.Service.Dtos;

import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TaskResponse {
    private String title;

    private String description;

    private boolean isDaily;

    private Long ownerId;

    private int howManyTimesADay;

    private List<Long> participantsId;
}
