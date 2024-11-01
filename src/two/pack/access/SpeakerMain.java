package two.pack.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        speaker.volume = 120;
        speaker.showVolume();
    }
}
