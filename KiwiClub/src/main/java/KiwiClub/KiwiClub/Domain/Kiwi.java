package KiwiClub.KiwiClub.Domain;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
import java.util.Date;

@Entity
public class Kiwi {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
	)
	@Column(name = "kiwiId", updatable = false, nullable = false)
	private UUID kiwiId;
	private UUID playerId;
	private String name;
	private boolean isAlive;
	private Sex sex;
	private KiwiSpecies species;
	@OneToOne
	private Weight weight;
	@OneToOne
	private Mood mood; // vagy külön osztály
	@OneToOne
	private LearnedTricks learnedTricks;
	private Date birthDate;
	private Date lastFedDate;
	private Date lastTaughtDate;

	public Kiwi() {
		
	}
	
	public Kiwi(String name, Sex sex, KiwiSpecies species, UUID playerId) {
		this.name = name;
		this.sex = sex;
		this.species = species;
		this.playerId=playerId;
	}
	
	public UUID getPlayerId() {
		return playerId;
	}

	public void setPlayerId(UUID playerId) {
		this.playerId = playerId;
	}

	public Date getLastFedDate() {
		return lastFedDate;
	}

	public void setLastFedDate(Date lastFedDate) {
		this.lastFedDate = lastFedDate;
	}

	public Date getLastTaughtDate() {
		return lastTaughtDate;
	}

	public void setLastTaughtDate(Date lastTaughtDate) {
		this.lastTaughtDate = lastTaughtDate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public KiwiSpecies getSpecies() {
		return species;
	}
	public void setSpecies(KiwiSpecies species) {
		this.species = species;
	}
	public Weight getWeight() {
		return weight;
	}
	public void setWeight(Weight weight) {
		this.weight = weight;
	}
	public Mood getMood() {
		return mood;
	}
	public void setMood(Mood mood) {
		this.mood = mood;
	}
	public LearnedTricks getLearnedTricks() {
		return learnedTricks;
	}
	public void setLearnedTricks(LearnedTricks learnedTricks) {
		this.learnedTricks = learnedTricks;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		// még implementálni kell a metódust
	    return 0;
		
	}
	
	
}
