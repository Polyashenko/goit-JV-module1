import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Maven {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map user = Map.of("name", "Dmitry", "lastName", "Poliashenko");
        objectMapper.writeValue(new File("user.json"), user);
        System.out.println("FuckingEnd");
    }
}
