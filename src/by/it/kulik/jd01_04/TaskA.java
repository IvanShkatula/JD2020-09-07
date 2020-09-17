package by.it.kulik.jd01_04;

public class TaskA {
    static void printMulTable() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1d*%1d=%-3d ", i, j, i * j);
            }
            System.out.println();

        }
    }
    static void buildOneDimArray (String line){
        double[] array = InOut.getArray(line);
        double start=array[0];
        double stop=array[array.length-1];
        InOut.printArray(array,"V",5);
        Helper.sort(array);
        InOut.printArray(array,"V",4);
        for (int i = 0; i < array.length; i++) {
            if (array[i]==start) {
            System.out.println();
                System.out.println("Index of first element="+i);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==stop) {
                System.out.println();
                System.out.println("Index of first element="+i);
                break;
            }
        }

    }

    public static void main(String[] args) {
        printMulTable();
    }
}
