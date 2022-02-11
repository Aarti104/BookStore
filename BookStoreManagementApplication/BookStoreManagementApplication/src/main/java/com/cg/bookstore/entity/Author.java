
package com.cg.bookstore.entity;

import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Author {
	
	@Id
	@SequenceGenerator(name="myauthorlogic",initialValue=100,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="myauthorlogic")
	private int authorid;
	private String authorname;
	private String autoremail;
	private int no_of_books;
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int authorid, String authorname, String autoremail, int no_of_books) {
		super();
		this.authorid = authorid;
		this.authorname = authorname;
		this.autoremail = autoremail;
		this.no_of_books = no_of_books;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + authorid;
		result = prime * result + ((authorname == null) ? 0 : authorname.hashCode());
		result = prime * result + ((autoremail == null) ? 0 : autoremail.hashCode());
		result = prime * result + no_of_books;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Author))
			return false;
		Author other = (Author) obj;
		if (authorid != other.authorid)
			return false;
		if (authorname == null) {
			if (other.authorname != null)
				return false;
		} else if (!authorname.equals(other.authorname))
			return false;
		if (autoremail == null) {
			if (other.autoremail != null)
				return false;
		} else if (!autoremail.equals(other.autoremail))
			return false;
		if (no_of_books != other.no_of_books)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + ", autoremail=" + autoremail
				+ ", no_of_books=" + no_of_books + "]";
	} 

	
}