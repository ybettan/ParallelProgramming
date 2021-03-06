package tests;

import ex1.Cell;


public class CellTest {

    public static void main(String args[]) {

        System.out.print("CellTest...");

        /* constructor test, isAlive() and getGlobalI\J() test */
        Cell c1 = new Cell(true, 4, 6, 3);
        Cell c2 = new Cell(false, 200, 6, 3);
        Cell c3 = new Cell(true, 15, 6, 3);
        Cell c4 = new Cell(false, 8, 6, 3);
        Cell c5 = new Cell(true, 4, 6, 3);
        Cell c6 = new Cell(false, 200, 6, 3);
        Cell c7 = new Cell(true, 15, 6, 3);
        Cell c8 = new Cell(false, 8, 6, 3);
        test(c1.isAlive() == true);
        test(c1.getGlobalI() == 6);
        test(c1.getGlobalJ() == 3);
        test(c2.isAlive() == false);
        test(c2.getGlobalI() == 6);
        test(c2.getGlobalJ() == 3);
        test(c3.isAlive() == true);
        test(c3.getGlobalI() == 6);
        test(c3.getGlobalJ() == 3);
        test(c4.isAlive() == false);
        test(c4.getGlobalI() == 6);
        test(c4.getGlobalJ() == 3);
        test(c5.isAlive() == true);
        test(c5.getGlobalI() == 6);
        test(c5.getGlobalJ() == 3);
        test(c6.isAlive() == false);
        test(c6.getGlobalI() == 6);
        test(c6.getGlobalJ() == 3);
        test(c7.isAlive() == true);
        test(c7.getGlobalI() == 6);
        test(c7.getGlobalJ() == 3);
        test(c8.isAlive() == false);
        test(c8.getGlobalI() == 6);
        test(c8.getGlobalJ() == 3);

        /* getGen() & addNeighbor() test */
        Cell deadCell = new Cell(false, 4, 6, 3);
        Cell liveCell = new Cell(true, 4, 6, 3);
        Cell c9 = new Cell(false, 4, 6, 3);
        test(c9.getGen() == 0);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        test(c9.needUpdate() == true);
        c9.moveToNextGen();
        test(c9.isAlive() == false);
        test(c9.getGen() == 1);
        /* this and the next copies are to update the inputCell gen */
        liveCell.increaseGen();
        deadCell.increaseGen();
        test(liveCell.isAlive() == true);
        test(deadCell.isAlive() == false);
        test(liveCell.getGen() == 1);
        test(deadCell.getGen() == 1);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        test(c9.needUpdate() == true);
        c9.moveToNextGen();
        test(c9.isAlive() == false);
        test(c9.getGen() == 2);
        liveCell.increaseGen();
        deadCell.increaseGen();
        test(liveCell.isAlive() == true);
        test(deadCell.isAlive() == false);
        test(liveCell.getGen() == 2);
        test(deadCell.getGen() == 2);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        test(c9.needUpdate() == false);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        test(c9.needUpdate() == true);
        c9.moveToNextGen();
        test(c9.isAlive() == false);
        test(c9.getGen() == 3);
        liveCell.increaseGen();
        deadCell.increaseGen();
        test(liveCell.isAlive() == true);
        test(deadCell.isAlive() == false);
        test(liveCell.getGen() == 3);
        test(deadCell.getGen() == 3);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(deadCell);
        test(c9.needUpdate() == true);
        c9.moveToNextGen();
        test(c9.isAlive() == true);
        test(c9.getGen() == 4);
        liveCell.increaseGen();
        deadCell.increaseGen();
        test(liveCell.isAlive() == true);
        test(deadCell.isAlive() == false);
        test(liveCell.getGen() == 4);
        test(deadCell.getGen() == 4);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(deadCell);
        c9.addNeighbor(deadCell);
        test(c9.needUpdate() == true);
        c9.moveToNextGen();
        test(c9.isAlive() == true);
        test(c9.getGen() == 5);
        liveCell.increaseGen();
        deadCell.increaseGen();
        test(liveCell.isAlive() == true);
        test(deadCell.isAlive() == false);
        test(liveCell.getGen() == 5);
        test(deadCell.getGen() == 5);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        c9.addNeighbor(liveCell);
        test(c9.needUpdate() == true);
        c9.moveToNextGen();
        test(c9.isAlive() == false);
        test(c9.getGen() == 6);
        liveCell.increaseGen();
        deadCell.increaseGen();
        test(liveCell.isAlive() == true);
        test(deadCell.isAlive() == false);
        test(liveCell.getGen() == 6);
        test(deadCell.getGen() == 6);

        ///* takeDataFrom() test */
        Cell deadCell0 = new Cell(false, 4, 6, 3);
        Cell liveCell0 = new Cell(true, 4, 6, 3);
        Cell deadCell1 = new Cell(false, 4, 6, 3);
        Cell liveCell1 = new Cell(true, 4, 6, 3);
        test(liveCell0.isAlive() == true);
        test(deadCell0.isAlive() == false);
        test(liveCell0.getGen() == 0);
        test(deadCell0.getGen() == 0);
        liveCell1.increaseGen();
        deadCell1.increaseGen();
        test(liveCell1.isAlive() == true);
        test(deadCell1.isAlive() == false);
        test(liveCell1.getGen() == 1);
        test(deadCell1.getGen() == 1);
        Cell currentGen = new Cell(false, 4, 6, 3);
        Cell nextGen = new Cell(false, 4, 6, 3);
        nextGen.increaseGen();
        test(currentGen.getGen() == 0);
        test(nextGen.getGen() == 1);

        nextGen.addNeighbor(liveCell1);
        nextGen.addNeighbor(liveCell1);
        nextGen.addNeighbor(liveCell1);
        test(nextGen.isAlive() == false);
        test(nextGen.getGen() == 1);
        currentGen.takeDataFrom(nextGen);
        test(nextGen.getGen() == 1);
        nextGen.increaseGen();
        currentGen.addNeighbor(deadCell0);
        test(currentGen.needUpdate() == true);
        currentGen.moveToNextGen();
        test(nextGen.isAlive() == false);
        test(nextGen.getGen() == 2);

        test(currentGen.isAlive() == true);
        test(currentGen.getGen() == 1);
        
        /* increaseGen() test */
        Cell c20 = new Cell(true, 5, 3, 4);
        test(c20.getGen() == 0);
        c20.increaseGen();
        test(c20.getGen() == 1);
        c20.increaseGen();
        test(c20.getGen() == 2);
        c20.increaseGen();
        test(c20.getGen() == 3);

        /* dcreaseGen() test */
        Cell c21 = new Cell(true, 5, 3, 4);
        test(c21.getGen() == 0);
        c21.decreaseGen();
        test(c21.getGen() == -1);
        c21.decreaseGen();
        test(c21.getGen() == -2);
        c21.decreaseGen();
        test(c21.getGen() == -3);
        c21.increaseGen();
        c21.increaseGen();
        c21.increaseGen();
        c21.increaseGen();
        c21.increaseGen();
        c21.increaseGen();
        test(c21.getGen() == 3);
        
        System.out.println("[OK]");
    } 

    private static void test(boolean statment) {
        if (statment == false) 
           System.err.println("ERROR");
    }

}








