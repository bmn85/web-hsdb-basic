package ru.bmn.web.hsdb.model.entity.hs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Race {
	@Id
	@GeneratedValue
	private Integer id;

	private String name;
	private String nameRu = "";

	public Integer getId() {
		return id;
	}

	public Race setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Race setName(String name) {
		this.name = name;
		return this;
	}

	public String getNameRu() {
		return nameRu;
	}

	public Race setNameRu(String nameRu) {
		this.nameRu = nameRu;
		return this;
	}
}
