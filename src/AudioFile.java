class AudioFile implements Media {
    public void play() {
        System.out.println("Playing audio file.");
    }

    public void pause() {
        System.out.println("Audio file paused.");
    }

    public void stop() {
        System.out.println("Audio file stopped.");
    }

    public void displayInfo() {
        System.out.println("Displaying audio file info.");
    }
}
