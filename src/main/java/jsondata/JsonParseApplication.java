package jsondata;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@SpringBootApplication
@RestController
public class JsonParseApplication {

	public static void main(String[] args) {

		SpringApplication.run(JsonParseApplication.class, args);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/home", produces = { "application/json" })
	public void ctrl(@RequestBody Object json) throws JsonProcessingException {
		System.out.println("===HOME CTRL========");

		System.out.println("***********========= jsonObject   : " + json);

		// object class ref convert in String class ref
		String jsonstr = new ObjectMapper().writeValueAsString(json);

		// String class object convert in JsonObject class object
		@SuppressWarnings("deprecation")
		JsonObject jsonObject2 = new JsonParser().parse(jsonstr).getAsJsonObject();

		System.out.println("json object in JsonObject " + jsonObject2);

		String pageName = jsonObject2.getAsJsonObject("pageInfo").get("pageName").getAsString();
		String logo = jsonObject2.getAsJsonObject("pageInfo").get("logo").getAsString();
		System.out.println("pageName  : 	 " + pageName + " \r\n logo  :  	" + logo);

		JsonArray arr = jsonObject2.getAsJsonArray("posts");
		for (int i = 0; i < arr.size(); i++) {
			String post_id = arr.get(i).getAsJsonObject().get("post_id").getAsString();
			String actor_id = arr.get(i).getAsJsonObject().get("actor_id").getAsString();
			String author_name = arr.get(i).getAsJsonObject().get("author_name").getAsString();
			String post_title = arr.get(i).getAsJsonObject().get("post_title").getAsString();
			String time_of_post = arr.get(i).getAsJsonObject().get("time_of_post").getAsString();

			System.out.println(" post_id : 	" + post_id + "\r\n actor_id : 		" + actor_id + "\r\n author_name :	"
					+ author_name + "\r\n post_title 	" + post_title + "\r\n time_of_post 	" + time_of_post);

			// store json array
			JsonArray comments = arr.get(i).getAsJsonObject().get("comments").getAsJsonArray();

			System.out.println("\r\n comments : 	" + comments);

		}

	}

}
