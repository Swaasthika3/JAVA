import java.util.LinkedList;

public class MusicPlaylist {
	private LinkedList<String> playlist= new LinkedList<>();
	
	// public MusicPlaylist() {
	// 	playlist ;
	// }
	
    public void addSong(String song) {
    	playlist.add(song);
    }

    public String getCurrentSong() {
        if (!playlist.isEmpty()) {
        	return playlist.getFirst();
        }
        return null;
    }

    public void playNextSong() {
        if (!playlist.isEmpty()) {
        	System.out.println("Now playing: " + playlist.removeFirst());
        } else {
        	System.out.println("Playlist is empty.");
        }
    }

    public boolean isEmpty() {
        return playlist.isEmpty();
    }

    public void clearPlaylist() {
        playlist.clear();
    }

	public static void main(String[] args) {
		MusicPlaylist playlist = new MusicPlaylist();
		
		playlist.addSong("Song 1");
		playlist.addSong("Song 2");
		playlist.addSong("Song 3");
		
		System.out.println("Current song: " + playlist.getCurrentSong());
		playlist.playNextSong();
		playlist.playNextSong();
		playlist.clearPlaylist();
		System.out.println(playlist.isEmpty());
	}

}
