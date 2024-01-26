package com.example.Spring_HW5.service;

import com.example.Spring_HW5.model.Task;
import com.example.Spring_HW5.model.TaskStatus;
import com.example.Spring_HW5.repository.TaskRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
@AllArgsConstructor
public class TaskService {

    /**
     * Подключение контроллера задач.
     */
    private TaskRepository taskRepository;


    /**
     * Сохранение новой задачи в бд.
     *
     * @param task Объект новой задачи.
     * @return Сохраненная задача.
     */
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }


    /**
     * Получение списка всех задач из бд.
     *
     * @return Список задач.
     */
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    /**
     * Получение списка задач по статусу.
     *
     * @param status Требуемый статус.
     * @return Список задача.
     */
    public List<Task> getTaskByStatus(TaskStatus status) {
        return taskRepository.findByStatus(status);
    }


    /**
     * Обновление статуса задачи.
     *
     * @param id     Идентификатор задачи.
     * @param status Новый статус.
     * @return Обновленная задача.
     */
    @Transactional
    public Task updateTaskStatus(Long id, TaskStatus status) {
        taskRepository.updateTaskStatusById(id, status);
        return taskRepository.findById(id).get();
    }


    /**
     * Удаление задачи.
     *
     * @param id Идентификатор задачи.
     */
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }


}
