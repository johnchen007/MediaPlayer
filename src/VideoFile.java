class VideoFile implements Media {
    public void play() {
        System.out.println("Playing video file.");
    }

    public void pause() {
        System.out.println("Video file paused.");
    }

    public void stop() {
        System.out.println("Video file stopped.");
    }

    public void displayInfo() {
        System.out.println("Displaying video file info.");
    }
}
