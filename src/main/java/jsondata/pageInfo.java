package jsondata;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat
public class pageInfo {

	private String pageName;
	private String logo;

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public pageInfo(String pageName, String logo) {
		super();
		this.pageName = pageName;
		this.logo = logo;
	}

	public pageInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pageInfo [pageName=" + pageName + ", logo=" + logo + "]";
	}

}
