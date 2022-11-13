package KiwiClub.Domain;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Kiwi {
	private int kiwiId;
	private String name;
	private boolean isAlive;
	private Sex sex;
	private KiwiSpecies species;
	private Weight weight;
	private Mood mood; // vagy külön osztály
	private LearnedTricks learnedTricks;
	private Date birthDate;
	
	public Kiwi() {
		
	}
	
	public Kiwi(int kiwiId, String name, Sex sex, KiwiSpecies species) {
		this.kiwiId = kiwiId;
		this.name = name;
		this.sex = sex;
		this.species = species;
	}

	public int getKiwiId() {
		return kiwiId;
	}
	public void setKiwiId(int kiwiId) {
		this.kiwiId = kiwiId;
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
