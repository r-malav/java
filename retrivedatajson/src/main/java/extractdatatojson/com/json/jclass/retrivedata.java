package extractdatatojson.com.json.jclass;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.tools.JavaFileObject;

import org.apache.http.client.methods.HttpGet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

public class retrivedata {

	public static void main(String[] args) throws IOException {
		String url = "https://gist.githubusercontent.com/r-malav/7a6e266c3ed2730064e0c2768761c9b5/raw/05e6d03f51638a98ebee23deaf0a3ed2b2c5d886/gistfile1.txt";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		con.setRequestMethod("GET");
		
		con.setRequestProperty("User-Agent", "chrome");
		int responseCode = con.getResponseCode();
		String Message = con.getResponseMessage();
		System.out.println(" URL : " + url);
		System.out.println("Response Code : " + responseCode);
		System.out.println("Response Message : " + Message);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		// print in String
		System.out.println("hello " + response.toString());
		int length = response.length();

		
		
		ObjectMapper simp = new ObjectMapper();
		
		simple obj_simpBean = new simple();
		obj_simpBean = simp.readValue(response.toString(), simple.class);
System.out.println(obj_simpBean);
		/* "-------Afer converting to java object-------------------"); 
		System.out.println("statusCode-" + obj_simpBean.getId());
		System.out.println("statusMessage-" + obj_simpBean.getFirst_name());
		System.out.println("ipAddress-" + obj_simpBean.getLast_name());
		System.out.println("countryCode-" + obj_simpBean.getEmail());
		System.out.println("countryName-" + obj_simpBean.getAvatar());*/

	}

}
