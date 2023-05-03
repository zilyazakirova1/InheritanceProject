public class Meeting extends SimpleTask {
    private String topic;
    private String project;
    private String start;

    public Meeting(int id, String title,String topic,String project,String start) {
        super(id, title);
        this.topic=topic;
        this.project=project;
        this.start=start;
        
    }
}
