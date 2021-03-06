package ru.bmn.web.hsdb.parser.hearthpwn;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.bmn.web.hsdb.model.entity.app.CollectionItem;
import ru.bmn.web.hsdb.model.entity.hs.Card;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Site {
	private static final Logger LOG = LogManager.getLogger(Site.class);

	/* default */ static String PREFIX = "http://www.hearthpwn.com/";


	public Site() {
	}

	public List<Card> getAllCards()
		throws IOException
	{
		List<Card> result = new ArrayList<>();

		LOG.info("Get all cards start process...");

		CardsDatabasePage cardsDatabasePage = new CardsDatabasePage(1);
		int totalPages = cardsDatabasePage.getPagesTotal();

		LOG.info("First page fetched, total pages: {}", totalPages);

		LOG.info("Parse first page...");
		result.addAll(cardsDatabasePage.getCards());

		for (int i = 2; i <= totalPages; i++) {
			LOG.info("Parse page #{}...", i);
			result.addAll(
				new CardsDatabasePage(i).getCards()
			);
		}

		LOG.info("All cards parsed!");
		return result;
	}

	public Set<CollectionItem> getUserCards(String userName)
		throws IOException
	{
		return new UserCollectionPage(userName).getCollection();
	}
}
