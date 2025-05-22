package task.collection;

import java.util.Objects;

public class Task {
    private int id;
    private String titel;
    private boolean isCompleted;


    public String getTitel() {
        return titel;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Task(int id, String title, boolean isCompleted) {
        this.id = id;
        this.titel = title;
        this.isCompleted = isCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(titel, task.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titel);
    }
}