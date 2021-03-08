package domain.entities;

public class Post implements HasAuthor,HasSentiment,IsCommentable,IsChronological{
	
	private Integer id;
	private String title;
	private String content;
	
	public Post() {}

	public Post(Integer id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	protected void finalize () {
		System.out.println("Object is destroyed!");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
}
