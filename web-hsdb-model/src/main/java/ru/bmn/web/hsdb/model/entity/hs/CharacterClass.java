package ru.bmn.web.hsdb.model.entity.hs;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(
	uniqueConstraints = {
		@UniqueConstraint(
			columnNames = {"name"}
		)
	}
)
public class CharacterClass {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String name;
	private String nameRu = "";

	@ManyToMany
	@JoinTable(
		name = "card2class",
		joinColumns = @JoinColumn(name = "class_id", referencedColumnName = "id"),
		inverseJoinColumns = @JoinColumn(name = "card_id", referencedColumnName = "id")
	)
	private Set<Card> cards;


	public Integer getId() {
		return id;
	}

	public CharacterClass setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public CharacterClass setName(String name) {
		this.name = name;
		return this;
	}

	public String getNameRu() {
		return nameRu;
	}
	public CharacterClass setNameRu(String nameRu) {
		this.nameRu = nameRu;
		return this;
	}

	public Set<Card> getCards() {
		return cards;
	}

	public CharacterClass setCards(Set<Card> cards) {
		this.cards = cards;
		return this;
	}
}
