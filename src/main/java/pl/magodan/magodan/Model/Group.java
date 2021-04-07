package pl.magodan.magodan.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "groups")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    @Id
    @GeneratedValue
    @Column(name = "id_group")
    private long id;
    @Column(name = "number_of_users")
    private int numberOfUsers;
    @OneToMany(mappedBy = "group")
    private List<UserGroup> users;

}
