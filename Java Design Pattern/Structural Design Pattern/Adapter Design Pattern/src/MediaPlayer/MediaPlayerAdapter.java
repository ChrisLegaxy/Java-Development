package MediaPlayer;

public class MediaPlayerAdapter implements MediaPlayer
{
    AdvanceMediaPlayer videoPlayer;

    public MediaPlayerAdapter()
    {
        videoPlayer = new VideoPlayer();
    }

    @Override
    public void playMusic(String audioType)
    {
        if(audioType.equalsIgnoreCase("mp4"))
        {
            videoPlayer.playVideo();
        }
        else
        {
            System.out.println("Unsupported Format");
        }
    }
}
