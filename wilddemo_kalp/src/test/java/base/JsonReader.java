package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

	private String username;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	private String password;
	private String email;
	private String phoneno;

	public void getdata() {

		JSONParser jsonParser = new JSONParser();
		FileReader reader = null;
		Object obj = null;
		String data1 = null;
		try {
			reader = new FileReader("./src/test/resources/userCreation.json");
			obj = jsonParser.parse(reader);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONArray data = (JSONArray) obj;

		JSONObject jsonobj = (JSONObject) data.get(0);

		username = (String) jsonobj.get("username");
		password = (String) jsonobj.get("password");
		email = (String) jsonobj.get("email");
		phoneno = (String) jsonobj.get("phoneno");
	}
}
