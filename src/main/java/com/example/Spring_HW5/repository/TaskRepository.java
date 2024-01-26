package com.example.Spring_HW5.repository;

import com.example.Spring_HW5.model.Task;
import com.example.Spring_HW5.model.TaskStatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    /**
     * Получение задач по статусу.
     * @param status Требуемый статус задачи.
     * @return Список задач.
     */
    List<Task> findByStatus(TaskStatus status);

    /**
     * Обновление статуса задачи по идентификатору.
     * @param id Идентификатор задачи.
     * @param status Новый статус задачи.
     * @return Кол-во обновленных строк.
     */
    @Modifying
    @Query("UPDATE task SET status = :status WHERE Id = :id")
    int updateTaskStatusById(Long id, TaskStatus status);
}

