import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0, management.exerciseList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }
    @Test
    public void addedExercisesIsInList(){
        management.add("My value");
        assertTrue(management.exerciseList().contains("My value"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
}
