package home;

public class Coc {
	private String name;
	private String rank;
	private String level;
	private String score;
	
	public Coc(String name, String rank, String level, String score) {
		setName(name);
		setRank(rank);
		setLevel(level);
		setScore(score);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setScore(String score) {
		this.score = score;
	}
	
	public String getScore() {
		return score;
	}
}
