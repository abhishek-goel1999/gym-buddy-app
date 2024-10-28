package com.hacktober.gymbuddy.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "diet_plans")
@Data
public class DietPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String mealName;
    private String mealTime;
    private int Calories;
    private String macronutrients;

    private String description;
}
