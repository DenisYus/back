package ru.denis.katacourse.ProjectBoot.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "roles")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "role", unique = true)
    private String userRole;
    @ManyToMany(mappedBy = "roles")
    private Set<UserEntity> user;
}
