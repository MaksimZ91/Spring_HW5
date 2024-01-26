## Spring Data для работы с базами данных  
Вам предстоит создать приложение для управления списком задач с использованием Spring Boot и Spring Data JPA. Требуется реализовать следующие функции:  
Добавление задачи. Подсказка метод в контроллере: @PostMapping public Task addTask(@RequestBody Task task)  
Просмотр всех задач. Подсказка метод в контроллере: @GetMapping public List<Task> getAllTasks()  
Просмотр задач по статусу (например, "завершена", "в процессе", "не начата"). Подсказка метод в контроллере: @GetMapping("/status/{status}") public List<Task> getTasksByStatus(@PathVariable TaskStatus status)  
Изменение статуса задачи. Подсказка метод в контроллере: @PutMapping("/{id}") public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task)  
Удаление задачи. Подсказка метод в контроллере:@DeleteMapping("/{id}") public void deleteTask(@PathVariable Long id)  
Репозитроий подсказка public interface TaskRepository extends JpaRepository<Task, Long>  

Структура задачи(класс Task):  
- ID (автоинкрементное)(тип Long)  
- Описание (не может быть пустым)(тип String)  
- Статус (одно из значений: "не начата", "в процессе", "завершена")(Тип TaskStatus )  
- Дата создания (автоматически устанавливается при создании задачи)(Тип LocalDateTime)  

### @PostMapping public Task addTask(@RequestBody Task task) 
![create](https://github.com/MaksimZ91/Spring_HW5/assets/72209139/f76b6ad0-7600-4044-9d82-c08ecaf9cd35)

### @GetMapping public List<Task> getAllTasks()  
![getAll](https://github.com/MaksimZ91/Spring_HW5/assets/72209139/69b4dd25-73ef-41a4-bf34-e9af80930b70)

### @GetMapping("/status/{status}") public List<Task> getTasksByStatus(@PathVariable TaskStatus status)
![getStatus](https://github.com/MaksimZ91/Spring_HW5/assets/72209139/a36c4742-287d-4b76-a27a-ed495773702c)

### @PutMapping("/{id}") public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task) 
![put](https://github.com/MaksimZ91/Spring_HW5/assets/72209139/57f8fcc0-ca13-48e5-834c-6f460879b145)
### @DeleteMapping("/{id}") public void deleteTask(@PathVariable Long id)  
![del](https://github.com/MaksimZ91/Spring_HW5/assets/72209139/a45b0bf1-cb0d-4b07-abe6-2763de52a8f8)
![fdell](https://github.com/MaksimZ91/Spring_HW5/assets/72209139/0be86793-9a90-45d6-885f-8718ec428d76)



