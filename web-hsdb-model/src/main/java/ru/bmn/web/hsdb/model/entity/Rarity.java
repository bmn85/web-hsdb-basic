package ru.bmn.web.hsdb.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rarity {
	@Id
	private int id;

	private String name;
	private String nameRu = "";
}