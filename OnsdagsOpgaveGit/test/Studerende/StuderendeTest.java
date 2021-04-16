package Studerende;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuderendeTest {

  @Test
  void testToString() {
    // Arrange
    int[] karakterer = {10, 12, 10, 10, 7, 7, 12};
    Studerende studerende = new Studerende("Kristian", 7);

    // Act
    String actual = studerende.getNavn();
    String expected = "Kristian";

    //Assert
    assertEquals(expected, actual);
  }
}