package com.hacktober.gymbuddy.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "sessions")
@Data
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String exerciseName;
    private int sets;
    private int reps;
    private String targetedMuscleGroups;
    private LocalDateTime sessionDate;

    private String notes;

}
