package TestData;

import controller.PersonController;
import model.LP;
import model.LPContainer;
import model.LPcopy;

public class TestData {

	public static void createTestdataPerson() {
		PersonController personController = new PersonController();
		personController.createPerson("Joe", "joe@mail.dk", "12345678", "Hervej 2", "9000", "Aalborg");
		personController.createPerson("jane", "jane@mail.dk", "23456789", "ligeHervej 2", "9230", "Svenstrup");
		personController.createPerson("joey", "joey@mail.dk", "34567890", "vejen 3", "9400", "Nørresundby");
	}

	public static void createTestdataLP() {
		LPContainer lpContainer = LPContainer.getInstance();
		LP[] testLPs = {
			findOrCreateLP(lpContainer, "TD-LP-001", "Test Album One", "Test Artist One", 2001),
			findOrCreateLP(lpContainer, "TD-LP-002", "Test Album Two", "Test Artist Two", 2002),
			findOrCreateLP(lpContainer, "TD-LP-003", "Test Album Three", "Test Artist Three", 2003)
		};

		for (LP lp : testLPs) {
			while (lp.getLpCopies().size() < 3) {
				int copyNo = lpContainer.getNextCopyNo();
				while (lpContainer.findLPcopy(copyNo) != null) {
					lpContainer.updateNextNo();
					copyNo = lpContainer.getNextCopyNo();
				}
				lp.getLpCopies().put(copyNo, new LPcopy(copyNo, "2026-01-01", 100.00));
				lpContainer.updateNextNo();
			}
		}
	}

	private static LP findOrCreateLP(LPContainer lpContainer, String barcode, String title, String artist, int year) {
		LP lp = lpContainer.findLP(title);
		if (lp == null) {
			lp = new LP(barcode, title, artist, year);
			lpContainer.addLP(lp);
		}
		return lp;
	}
}
