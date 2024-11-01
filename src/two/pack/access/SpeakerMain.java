package two.pack.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // speaker.volume = 120; // private 적용으로 접근 불가능
        speaker.showVolume();
    }
}
