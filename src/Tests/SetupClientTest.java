package Tests;

import Client.SetupClient;
import Server.QuizServerLauncher;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.rmi.RemoteException;

public class SetupClientTest {
    private static SetupClient maker;
    private static QuizServerLauncher serverLauncher;

    @BeforeClass
    public void buildUp() throws RemoteException {
        serverLauncher = new QuizServerLauncher();
        maker = new SetupClient();
    }

    @After
    public void tearDown() {
        File testFile = new File("Quiz.txt");
        if(testFile.exists()) {
            testFile.delete();
        }
    }


    @Test
    public void testNewQuiz() {

    }

    @Test
    public void testAddQuestions()  {

    }

    @Test
    public void testAddQuestions1() {

    }

    @Test
    public void testCloseQuiz() {

    }

    @Test
    public void testOpenQuiz() {

    }
}