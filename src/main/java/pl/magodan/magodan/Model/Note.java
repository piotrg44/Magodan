package pl.magodan.magodan.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "note")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Note {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "date_of_created")
    private LocalDate dateOfCreated;
    @Column(name = "date_of_lapse")
    private String date_of_lapse;
    @ManyToOne
    private User owner;

}
