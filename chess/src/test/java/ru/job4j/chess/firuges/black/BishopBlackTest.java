package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        assertThat(
                new BishopBlack(Cell.C8)
                        .position(),
                is(Cell.C8)
        );
    }

    @Test
    public void copy() {
        assertThat(
                new BishopBlack(Cell.C8)
                        .copy(Cell.C8)
                        .position(),
                is(Cell.C8)
        );
    }

    @Test
    public void way() {
        BishopBlack elephant = new BishopBlack(Cell.C1);
        Cell[] cells = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertTrue(Arrays.equals(elephant.way(Cell.G5), cells));
    }

    @Test
    public void isDiagonal() {
        BishopBlack elephant = new BishopBlack(Cell.C1);
        assertThat(
                Math.abs(Cell.G5.getX() - elephant.position().getX()),
                is(Math.abs(Cell.G5.getY() - elephant.position().getY()))
        );
    }

}