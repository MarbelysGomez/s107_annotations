package s107_annotations.S107_N2exercise1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Custom_AnnJson {
    private String data;
    public Custom_AnnJson(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void serializeToJson(Object obj, String directory) throws IOException {

        if (!Files.exists(Paths.get(directory))) {
            throw new IOException("Directory doesn't exist: " + directory);
        }
        if (!Files.isWritable(Paths.get(directory))) {
            throw new IOException("Can't write to the directory: " + directory);
        }
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(directory + "\\file.json"), obj);
    }
}
