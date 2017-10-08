import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void singBeforeQuest(){ //called before quest
        stream.println("The knight is so brave.");
    }

    public void singAfterQuest(){ //called after quest
        stream.println("The brave knight did embark on a quest!");
    }
}
