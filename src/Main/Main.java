package Main;

import Screens.ImportFileScreen;
import Screens.Screen;

public class Main {

    public static void main(String[] args) {
        DisplayScreen(ImportFileScreen.class);
    }

    public static void DisplayScreen(Class screenClass) {
        if (Screen.class.isAssignableFrom(screenClass)) {
            try {
                Object obj = screenClass.newInstance();
                ((Screen) obj).DisplayScreen();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
