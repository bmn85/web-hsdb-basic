package ru.bmn.web.hsdb.model.entity.hs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Series {
	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	private String nameRu = "";

	public Integer getId() {
		return id;
	}

	public Series setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Series setName(String name) {
		this.name = name;
		return this;
	}

	public String getNameRu() {
		return nameRu;
	}

	public Series setNameRu(String nameRu) {
		this.nameRu = nameRu;
		return this;
	}
}