package hibernate_demo4.o2o_uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Reviews {
	
	//define Fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "comment")
	private String comment;

	public Reviews() {
		super();
	}

	public Reviews(String comment) {
		super();
		this.comment = comment;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", comment=" + comment + "]";
	}
	
	
	
	
	//constructors, getter and setters & toString
	
	//Annotate fields

}
