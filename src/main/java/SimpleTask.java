public class SimpleTask {
    protected int id;
    protected String title;
    public SimpleTask (int id,String title) {
        this.id=id;
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}

