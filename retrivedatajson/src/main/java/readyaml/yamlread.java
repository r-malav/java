package readyaml;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
public class yamlread {

	public static void main(String[] args)throws Exception {
		
		File file = new File("src/main/java/readyaml/data.yaml");
		ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
		userinfo config =objectMapper.readValue(file, userinfo.class); 
		System.out.println("userinfo info " + config.toString());
	}

}
