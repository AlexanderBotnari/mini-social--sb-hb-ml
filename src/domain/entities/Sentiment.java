package domain.entities;

public class Sentiment implements HasAuthor,IsChronological{
	
	private Integer id;
	private String name;
	
	public Sentiment() {}

	public Sentiment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sentiment [id=" + id + ", name=" + name + "]";
	}

}
