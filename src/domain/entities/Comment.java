package domain.entities;

public class Comment implements HasAuthor,HasSentiment,IsCommentable,IsChronological{

	private Integer id;
	private String body;
	
	public Comment() {}

	public Comment(Integer id, String body) {
		super();
		this.id = id;
		this.body = body;
	}
	
	protected void finalize() {
		System.out.println("Object is destroyed!");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", body=" + body + "]";
	}
	
}
