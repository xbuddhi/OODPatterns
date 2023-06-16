/**
 * Window
 */
public abstract class Window {

    protected abstract void onClosing();
    protected abstract void onClosed();

    public void close() {
        onClosing();
        //close the window
        onClosed();
    }

}