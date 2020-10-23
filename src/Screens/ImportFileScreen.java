package Screens;

import Main.DataStorage;
import Main.FileManager;

import java.util.Scanner;

public class ImportFileScreen implements Screen {
    @Override
    public void DisplayScreen() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter the name of file containing categories: ");
        String cateFileName = myScanner.nextLine();
        DataStorage.categories = FileManager.ImportCategoryList(cateFileName);
    }
}
