package Main;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    public static ArrayList<Category> ImportCategoryList(String fileName) {
        File categoryFile = new File(fileName);
        ArrayList<Category> categories = new ArrayList<Category>();
        if (categoryFile.exists()) {
            try {
                Scanner cateReader = new Scanner(categoryFile);
                while (cateReader.hasNextLine()) {
                    String cateString = cateReader.nextLine();
                    String[] cateElements = cateString.split(" ", 2);
                    categories.add(new Category(Integer.parseInt(cateElements[0]), cateElements[1]));
                    //Need to have a check if id and name are unique
                }
            } catch (Exception e) {
                System.out.println("An error occurred.");
            }
        } else {
            System.out.println("The file does not exist.");
        }

        return categories;
    }
}
