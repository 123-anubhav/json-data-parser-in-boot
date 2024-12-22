package jsondata;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class posts {

	private String post_id;
	private String actor_id;

	public String getPost_id() {
		return post_id;
	}

	public void setPost_id(String post_id) {
		this.post_id = post_id;
	}

	public String getActor_id() {
		return actor_id;
	}

	public void setActor_id(String actor_id) {
		this.actor_id = actor_id;
	}

	public String getPost_title() {
		return post_title;
	}

	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}

	public String getTime_of_post() {
		return time_of_post;
	}

	public void setTime_of_post(String time_of_post) {
		this.time_of_post = time_of_post;
	}

	public String[] getComments() {
		return comments;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "posts [post_id=" + post_id + ", actor_id=" + actor_id + ", post_title=" + post_title + ", time_of_post="
				+ time_of_post + ", comments=" + Arrays.toString(comments) + "]";
	}

	public posts(String post_id, String actor_id, String post_title, String time_of_post, String[] comments) {
		super();
		this.post_id = post_id;
		this.actor_id = actor_id;
		this.post_title = post_title;
		this.time_of_post = time_of_post;
		this.comments = comments;
	}

	public posts() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String post_title;
	private String time_of_post;
	private String[] comments;
}
