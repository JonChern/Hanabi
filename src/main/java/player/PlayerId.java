package player;

public class PlayerId {

    String id;


    public static PlayerId of(String id){
        return new PlayerId(id);
    }

    public PlayerId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PlayerId{" +
                "id='" + id + '\'' +
                '}';
    }
}
