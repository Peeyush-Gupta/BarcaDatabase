package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
 * @Autowired is Spring's own (legacy) annotation.
 * @Inject is part of a new Java technology called CDI that 
 * defines a standard for dependency injection similar to Spring. 
 */
@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

	/*
	 * @Autowired in case of setter method
	 * public void setCompactDisc(CompactDisc cd)
	 *  { this.cd = cd; }
	 */

	/*
	 * @Autowired in case of normal method 
	 * public void insertDisc(CompactDisc cd) 
	 * { this.cd = cd; }
	 */
}