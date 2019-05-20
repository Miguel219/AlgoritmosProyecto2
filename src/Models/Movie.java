package Models;

public class Movie {

	private String id;
	private String actor;
	private String director;
	private String producer;
	private String qualification;
	private String date;
	private String popularity;
	
	public Movie() {
		// TODO Auto-generated constructor stub
		id = "";
		actor = "";
		director = "";
		producer = "";
		qualification = "";
		date = "";
		popularity = "";
	}

	/**
	 * @param id
	 * @param actor
	 * @param director
	 * @param producer
	 * @param qualification
	 * @param date
	 * @param popularity
	 */
	public Movie(String id, String actor, String director, String producer, String qualification, String date,
			String popularity) {
		super();
		this.id = id;
		this.actor = actor;
		this.director = director;
		this.producer = producer;
		this.qualification = qualification;
		this.date = date;
		this.popularity = popularity;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the actor
	 */
	public String getActor() {
		return actor;
	}

	/**
	 * @param actor the actor to set
	 */
	public void setActor(String actor) {
		this.actor = actor;
	}

	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return the producer
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * @param producer the producer to set
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the popularity
	 */
	public String getPopularity() {
		return popularity;
	}

	/**
	 * @param popularity the popularity to set
	 */
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Movie [id=" + id + ", actor=" + actor + ", director=" + director + ", producer=" + producer
				+ ", qualification=" + qualification + ", date=" + date + ", popularity=" + popularity + "]";
	}
	
	

}
