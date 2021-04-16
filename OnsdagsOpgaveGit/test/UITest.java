import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UITest {

  @Test
  void validerKarakter() {
    //Arrange
    int karakter = UI.validerKarakter(12);

    //Act
    int expected = 12;

    //Assert
    assertEquals(expected, karakter);

  }

  @Test
  void forkertKarakter() {
    //Arrange
    int karakter = UI.validerKarakter(11);

    //Act
    int expected = 11;

    //Assert
    assertEquals(expected, karakter);
  }
}
