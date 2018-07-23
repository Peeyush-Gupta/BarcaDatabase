package soundsystem;

import org.springframework.stereotype.Component;

@Component

// @Component("lonelyHeartsClub")
// @Named("lonelyHeartsClub")

/*
 * @Inject instead of Spring’s @Autowired to inject a bean.
 * 
 * @Named instead of Spring’s @Component to declare a bean.
 */
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
