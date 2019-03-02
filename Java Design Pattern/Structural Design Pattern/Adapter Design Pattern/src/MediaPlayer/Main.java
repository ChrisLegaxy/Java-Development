package MediaPlayer;

public class Main
{
    public static void main(String[] args)
    {
        MediaPlayer musicPlayer = new MusicPlayer();
        AdvanceMediaPlayer videoPlayer = new VideoPlayer();

        musicPlayer.playMusic("mp3");
        videoPlayer.playVideo();
        musicPlayer.playMusic("mp4");
        musicPlayer.playMusic("mp5");
    }
}
