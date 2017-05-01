package ru.bmn.web.hsdb.model.entity.app;

import ru.bmn.web.hsdb.model.entity.hs.Card;

import javax.persistence.*;

@Entity
@Table(
	uniqueConstraints = {
		@UniqueConstraint(
			columnNames = {"user_id", "card_id"}
		)
	}
)
public class CollectionItem {
	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "card_id")
	private Card card;

	private Integer normalCount = 0;
	private Integer goldCount = 0;

	public Integer getId() {
		return id;
	}

	public CollectionItem setId(Integer id) {
		this.id = id;
		return this;
	}

	public User getUser() {
		return user;
	}

	public CollectionItem setUser(User user) {
		this.user = user;
		return this;
	}

	public Card getCard() {
		return card;
	}

	public CollectionItem setCard(Card card) {
		this.card = card;
		return this;
	}

	public Integer getNormalCount() {
		return normalCount;
	}

	public CollectionItem setNormalCount(Integer normalCount) {
		this.normalCount = normalCount;
		return this;
	}

	public Integer getGoldCount() {
		return goldCount;
	}

	public CollectionItem setGoldCount(Integer goldCount) {
		this.goldCount = goldCount;
		return this;
	}
}
