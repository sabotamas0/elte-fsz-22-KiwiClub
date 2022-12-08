package KiwiClub.KiwiClub.Domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Trick {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID TrickId;
	private String name;
	private int lectures;

	public UUID getTrickId() {
		return TrickId;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	private LearnedTricks learnedTricks;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLectures() {
		return lectures;
	}
	public void setLectures(int lectures) {
		this.lectures = lectures;
	}


	
	
	
}
