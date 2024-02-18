package by.epam.lb.nb.main;
import java.util.Date;

public class Note {
	private static final Note instance = new Note();
	
	private String note;
	private Date date;
	
	private Note() {}
	
	public static Note getInstance() {
		return instance;
	}

}
