package in.koost.scgi.joatf.university.management.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
