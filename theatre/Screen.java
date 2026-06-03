package theatre;

public class Screen {

    private int screenId;

    public Screen(int screenId) {
        this.screenId = screenId;
    }

    public void displayScreen() {
        System.out.println("Screen Number : " + screenId);
    }
}