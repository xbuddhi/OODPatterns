public class MovieWindow extends Window {

    @Override
    protected void onClosing() {
        System.out.println("MovieWindow: onClosing");
    }

    @Override
    protected void onClosed() {
        System.out.println("MovieWindow: onClosed");
    }

}
