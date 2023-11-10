package s107_annotations.S107_N2exercise1;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class JsonSerializer {
    private static ObjectMapper mapper = new ObjectMapper();

    public static void serializeToJson(Object obj, String directory) throws IOException {
        if (!Files.exists(Paths.get(directory))) {
            throw new IOException("Directory doesn't exist: " + directory);
        }
        if (!Files.isWritable(Paths.get(directory))) {
            throw new IOException("Can't write to the directory: " + directory);
        }
        String filename = directory + "\\" + obj.getClass().getSimpleName() + ".json";
        mapper.writeValue(new File(filename), obj);
    }
}
