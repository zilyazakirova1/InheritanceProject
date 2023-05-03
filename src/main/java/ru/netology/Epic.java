package ru.netology;

import ru.netology.Task;

public class Epic extends Task {
    protected String [] subtasks;
    public Epic(int id, String[] subtasks){
        super(id);
        this.subtasks=subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}
