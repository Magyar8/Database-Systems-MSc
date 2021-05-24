package myBatis_LeagueofLegends;

public class Champion {

	private int cid;
	private String Cname;
	private String role;
	private String difficulty;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		this.Cname = cname;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
}
