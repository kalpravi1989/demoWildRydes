package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

	public String getdata(String dataname) {

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

		String dataele = (String) jsonobj.get(dataname);
		return dataele;
	}
}
