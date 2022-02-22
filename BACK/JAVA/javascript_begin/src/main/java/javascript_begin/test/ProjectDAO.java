package javascript_begin.test;


public class ProjectDAO {
	
	private final long id;
	private final String content;

	public ProjectDAO(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
