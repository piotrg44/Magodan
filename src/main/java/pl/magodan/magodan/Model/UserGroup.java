package pl.magodan.magodan.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "user_group")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserGroup {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_group")
    Group group;
    @ManyToOne
    @JoinColumn(name = "id_user")
    User user;
}
