package com.capgemini.onlinemoviebooking.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="movie_Screen")
public class Screen {
	@Id
	@Column(name="screen_id")
	private Integer screeinId;
	
	@Column(name="screen_name")
	private String screenname;
	
	@OneToMany
	@JoinColumn(name="screen_show")
	private List<Show> showlist;
	
	@Column(name="screen_rows")
	private int screenrows;
	
	@Column(name="screen_columns")
	private int columns;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Theater theaterId;

	public int getScreeinId() {
		return screeinId;
	}

	public void setScreeinId(int screeinId) {
		this.screeinId = screeinId;
	}

	public String getScreenname() {
		return screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public List<Show> getShowlist() {
		return showlist;
	}

	public void setShowlist(List<Show> showlist) {
		this.showlist = showlist;
	}

	public int getScreenrows() {
		return screenrows;
	}

	public void setScreenrows(int screenrows) {
		this.screenrows = screenrows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Theater getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(Theater theaterId) {
		this.theaterId = theaterId;
	}

	public Screen(int screeinId, String screenname, List<Show> showlist, int screenrows, int columns,
			Theater theaterId) {
		super();
		this.screeinId = screeinId;
		this.screenname = screenname;
		this.showlist = showlist;
		this.screenrows = screenrows;
		this.columns = columns;
		this.theaterId = theaterId;
	}

	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Screen [screeinId=" + screeinId + ", screenname=" + screenname + ", showlist=" + showlist
				+ ", screenrows=" + screenrows + ", columns=" + columns + ", theaterId=" + theaterId + "]";
	}
	
	


}
