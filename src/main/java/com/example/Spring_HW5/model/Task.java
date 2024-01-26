package com.example.Spring_HW5.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "task")
public class Task {
    /**
     * Идентификатор задачи.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    /**
     * Описание задачи.
     */
    @Column(nullable = false)
    private String description;

    /**
     * Статус задачи.
     */
    @Builder.Default
    private TaskStatus status = TaskStatus.NOT_STARTED;

    /**
     * Дата время создание задачм.
     */
    @Builder.Default
    private LocalDateTime localDateTime = LocalDateTime.now();


}
