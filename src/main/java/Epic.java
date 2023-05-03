public class Epic extends SimpleTask{
    private String [] subtasks;
    public Epic(int id, String title, String[] subtasks){
        super(id,title);
        this.subtasks=subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}
