class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    private Task head = null;
    private Task current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = head;
        head = newTask;
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);

        if (head == null) {
            head = newTask;
            newTask.next = head;
            current = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTask;
        newTask.next = head;
    }

    // Add at specific position
    void addAtPosition(int id, String name, int priority, String dueDate, int position) {
        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        Task newTask = new Task(id, name, priority, dueDate);
        Task temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove by task ID
    void removeById(int id) {
        if (head == null) return;

        Task temp = head;
        Task prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    Task last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Move to next task
    Task getNextTask() {
        if (current == null) return null;
        Task temp = current;
        current = current.next;
        return temp;
    }

    // Display all tasks
    void displayAllTasks() {
        if (head == null) return;

        Task temp = head;
        do {
            System.out.println(
                temp.taskId + " " +
                temp.taskName + " " +
                temp.priority + " " +
                temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) return;

        Task temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(
                    temp.taskId + " " +
                    temp.taskName + " " +
                    temp.dueDate
                );
            }
            temp = temp.next;
        } while (temp != head);
    }
}

public class TaskManagement {
    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtBeginning(1, "Design", 1, "2026-01-30");
        scheduler.addAtEnd(2, "Coding", 2, "2026-02-01");
        scheduler.addAtEnd(3, "Testing", 1, "2026-02-03");

        scheduler.displayAllTasks();
        scheduler.removeById(2);
        scheduler.searchByPriority(1);
    }
}
