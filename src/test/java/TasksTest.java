import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class TasksTest {
    @Test
    public void shouldSolveIfSimpleTaskMatchesFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("test");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSolveIfSimpleTaskMatchesTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSolveIfEpicMatchesTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSolveIfEpicMatchesFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Огурцы");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSolveIfMeetingMatchesFalse() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Привет");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSolveIfMeetingProjectMatchesTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSolveIfMeetingTopicMatchesTrue() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetterForSimpleTask(){
        SimpleTask simpleTask=new SimpleTask(5, "Привет");
        Assertions.assertEquals("Привет", simpleTask.getTitle());
    }

    @Test
    public void testGetterForEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        int id;
        Epic epic = new Epic(5,subtasks);
        Assertions.assertArrayEquals(subtasks, epic.getSubtasks());
    }
    @Test
    public void testGetterForMeetingTopic() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Assertions.assertEquals("Выкатка 3й версии приложения", meeting.getTopic());
    }
    public void newTestGetterForMeetingProject() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Assertions.assertEquals("Приложение НетоБанка", meeting.getProject());
    }
    public void newTestGetterForMeetingStart() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Assertions.assertEquals("Во вторник после обеда", meeting.getStart());
    }



}



