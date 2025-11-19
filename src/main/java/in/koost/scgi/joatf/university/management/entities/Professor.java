package in.koost.scgi.joatf.university.management.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToOne(mappedBy = "head")
    private Department departments;

    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();
}
