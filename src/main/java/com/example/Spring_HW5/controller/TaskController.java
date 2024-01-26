package com.example.Spring_HW5.controller;

import com.example.Spring_HW5.model.Task;
import com.example.Spring_HW5.model.TaskStatus;
import com.example.Spring_HW5.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {
    /**
     * Подключение сервиса задач.
     */
    private TaskService taskService;

    /**
     * Добавление новой задачи
     *
     * @param task Объект новой задачи.
     * @return Сохраненная задача.
     */
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    /**
     * Получение всех задач
     *
     * @return Список задач.
     */
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    /**
     * Получение задач с определенным статусом.
     *
     * @param status Требуемый статус задачи.
     * @return Список задач по статусу.
     */
    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable TaskStatus status) {
        return taskService.getTaskByStatus(status);
    }

    /**
     * Обновление статуса задачи
     *
     * @param id   Идентификатор задачи.
     * @param task Объект обновленной задачи (достаточно изменить поле status согласно enum)
     * @return Обновленная задача.
     */
    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTaskStatus(id, task.getStatus());
    }

    /**
     * Удаление задачи.
     *
     * @param id Идентификатор задачи.
     */
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }


}
