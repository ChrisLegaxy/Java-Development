package MediaPlayer;

public class MusicPlayer implements MediaPlayer
{
    @Override
    public void playMusic(String audioType)
    {
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing Audio");
        }
        else if(audioType.equalsIgnoreCase("mp4"))
        {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter();
            mediaPlayerAdapter.playMusic(audioType);
        }
        else
        {
            System.out.println("Unsupported Format");
        }
    }
}
