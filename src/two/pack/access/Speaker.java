package two.pack.access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("최소 음량입니다.");
        } else {
            volume--;
            System.out.println("볼륨을 감소합니다.");
        }
    }

    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
