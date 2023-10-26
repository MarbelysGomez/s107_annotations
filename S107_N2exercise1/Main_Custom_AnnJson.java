package s107_annotations.S107_N2exercise1;

import java.io.IOException;

public class Main_Custom_AnnJson {
    public static void main(String[] args) {
        Custom_AnnJson custom = new Custom_AnnJson("Running annotations.");
        custom.setData("Testing custom annotations.");
        Object obj = custom;

        try {
            custom.serializeToJson(obj,"D:\\IdeaProjects\\s1_Java_Language\\src\\main\\java\\S107_N2exercise1");
            System.out.println("Serialization successful!");
        }
        catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }
    }
}
