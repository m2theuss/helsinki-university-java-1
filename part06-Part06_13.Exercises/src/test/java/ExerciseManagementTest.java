import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;

public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exercisesListEmptyAtBeginning(){
        assertEquals(0, management.exercisesList().size());
    }
    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write a test");
        assertEquals(1, management.exercisesList().size());
    }
    @Test
    public void addedExercisesIsInList(){
        management.add("My value");
        assertTrue(management.exercisesList().contains("My value"));
    }
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
        management.add("Test");
        management.isCompleted("Test");
        assertFalse(management.isCompleted("New value"));
    }
}