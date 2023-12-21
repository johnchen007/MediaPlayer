import java.util.Scanner;

public class MediaPlayerDemo {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose an option:");
        System.out.println("1. Play Audio");
        System.out.println("2. Play Video");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Media myAudio = new AudioFile();
                player.playMedia(myAudio);
                player.displayMediaInfo(myAudio);
                player.pauseMedia(myAudio);
                player.stopMedia(myAudio);
                break;
            case 2:
                Media myVideo = new VideoFile();
                player.playMedia(myVideo);
                player.displayMediaInfo(myVideo);
                player.pauseMedia(myVideo);
                player.stopMedia(myVideo);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
