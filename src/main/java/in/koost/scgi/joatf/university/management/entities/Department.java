package in.koost.scgi.joatf.university.management.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Student> students;

    @OneToOne
    @JoinColumn(name = "head_id")
    private Professor head;
}
