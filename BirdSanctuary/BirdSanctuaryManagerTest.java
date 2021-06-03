package BirdSanctuary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BirdSanctuaryManagerTest {

	@Test
	 void givenBird_IfNull_ShouldThrowBirdSan()throws BirdSanctuaryException {
		BirdSanctuaryManager birdsan = new BirdSanctuaryManager();
		Birds bird = new Parrot(null);
		birdsan.add(bird);
		Assertions.assertThrows(BirdSanctuaryException.class, () -> birdsan.add(bird));
	}

}
