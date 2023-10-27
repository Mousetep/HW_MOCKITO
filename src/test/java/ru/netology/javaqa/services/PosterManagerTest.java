package ru.netology.javaqa.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void shouldAddPoster() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Bloodshot");

        int expected = 1;
        int actual = manager.getPostersCount();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAddPoster1() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-неведимка");
        manager.addPoster("Троли. Мировой тур");
        manager.addPoster("Номер один");
        manager.findAll();


        String[] expected = new String[]{"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-неведимка", "Троли. Мировой тур", "Номер один"};
        Assertions.assertArrayEquals(manager.findAll(), expected);
    }

    @Test
    public void shouldFindAllPostersWithReverse() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-неведимка");
        manager.addPoster("Троли. Мировой тур");
        manager.addPoster("Номер один");

        String[] expected = new String[]{"Номер один", "Троли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldFindAllPostersWithReverseWithLimit10() {
        PosterManager manager = new PosterManager(10);
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-неведимка");
        manager.addPoster("Троли. Мировой тур");
        manager.addPoster("Номер один");

        String[] expected = new String[]{"Номер один", "Троли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldFindAllPostersWithReverseWithLimit5() {
        PosterManager manager = new PosterManager(5);
        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-неведимка");
        manager.addPoster("Троли. Мировой тур");
        manager.addPoster("Номер один");

        String[] expected = new String[]{"Номер один", "Троли. Мировой тур", "Человек-неведимка", "Джентельмены", "Отель Белград"};
        Assertions.assertArrayEquals(expected, manager.findLast());
    }
}
