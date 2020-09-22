package egovframework.example.user.domain;

public class UserVO {
	private String userid;
	private String name;
	private String password;
	private Integer u_exp;
	private Integer u_level;
	private String img;
	private Integer cnt;

	public final String getUserid() {
		return userid;
	}

	public final void setUserid(String userid) {
		this.userid = userid;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getPassword() {
		return password;
	}

	public final void setPassword(String password) {
		this.password = password;
	}

	public final Integer getU_exp() {
		return u_exp;
	}

	public final void setU_exp(Integer u_exp) {
		this.u_exp = u_exp;
	}

	public final Integer getU_level() {
		return u_level;
	}

	public final void setU_level(Integer u_level) {
		this.u_level = u_level;
	}

	public final String getImg() {
		return img;
	}

	public final void setImg(String img) {
		this.img = img;
	}

	public final Integer getCnt() {
		return cnt;
	}

	public final void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", name=" + name + ", password=" + password + ", u_exp=" + u_exp
				+ ", u_level=" + u_level + ", img=" + img + ", cnt=" + cnt + ", getUserid()=" + getUserid()
				+ ", getName()=" + getName() + ", getPassword()=" + getPassword() + ", getU_exp()=" + getU_exp()
				+ ", getU_level()=" + getU_level() + ", getImg()=" + getImg() + ", getCnt()=" + getCnt()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}