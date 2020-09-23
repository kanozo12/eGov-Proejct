package egovframework.example.domain;

public class BoardVO {
	private Integer id;
	private String title;
	private String content;
	private String writer;
	private String writeDate;

	private String name;
	private String img;
	private Integer u_level;

	private String b_type;

	private String fileName;

	public final String getFileName() {
		return fileName;
	}

	public final void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public final String getB_type() {
		return b_type;
	}

	public final void setB_type(String b_type) {
		this.b_type = b_type;
	}

	public final Integer getId() {
		return id;
	}

	public final void setId(Integer id) {
		this.id = id;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final String getContent() {
		return content;
	}

	public final void setContent(String content) {
		this.content = content;
	}

	public final String getWriter() {
		return writer;
	}

	public final void setWriter(String writer) {
		this.writer = writer;
	}

	public final String getWriteDate() {
		return writeDate;
	}

	public final void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getImg() {
		return img;
	}

	public final void setImg(String img) {
		this.img = img;
	}

	public final Integer getU_level() {
		return u_level;
	}

	public final void setU_level(Integer u_level) {
		this.u_level = u_level;
	}

	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", title=" + title + ", content=" + content + ", writer=" + writer + ", writeDate="
				+ writeDate + ", name=" + name + ", img=" + img + ", u_level=" + u_level + ", b_type=" + b_type
				+ ", fileName=" + fileName + "]";
	}
}
