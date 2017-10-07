import java.util.HashMap;
import java.util.Map;

public class VotingBooth {

    VoteRecorder recorder = null;

    public void setRecorder(VoteRecorder recorder) {
        this.recorder = recorder;
    }

    public void vote(Candidate candidate){
        recorder.record(candidate);
    }
}
