package s107_annotations.S107_N2exercise1;

import java.io.IOException;

public class Main_Custom_AnnJson {
    public static void main(String[] args) {
        Custom_AnnJson custom = new Custom_AnnJson("Running annotations.");
        custom.setData("Testing custom annotations.");

        try {
            JsonSerializer.serializeToJson(custom, Custom_AnnJson.class.getAnnotation(JsonSerialize.class).directory());
            System.out.println("Serialization successful!");
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }
    }
}
