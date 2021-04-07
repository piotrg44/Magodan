package pl.magodan.magodan.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "users")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.MERGE)
    private List<Task> tasks;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.MERGE)
    private List<Note> notes;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserGroup> groups;

}
