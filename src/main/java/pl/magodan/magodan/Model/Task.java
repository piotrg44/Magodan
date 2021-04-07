package pl.magodan.magodan.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "task")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_task")
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String Description;
    @Column(name = "is_daily")
    private boolean isDaily;
    @Column(name = "how_many_times_a_day")
    private int howManyTimesADay;
    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;
    @OneToMany
    private List<User> participants;
}
