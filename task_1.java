@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Ожидалось, что возраст больше 18 лет, и пользователь будет признан взрослым (true).", true, isAdult); // Напиши код здесь
}