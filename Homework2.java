/**
 * Created by User on 31.03.2017.
 */
public class Homework2 {
    public static void main(String[] args) {
        //Обрабатываю два типа исключения
        try {
            String str = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0";
            System.out.println("Массив после преобразования:");
            System.out.println(getArray(str));
        }
        catch (NumberFormatException e)
        {
            System.out.println("В массиве присутствует символ или слово");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Размерность не соответствует 4x4");
        }
    }
    //Метод преобразования строки в массив
    private static int getArray(String str) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        String[] strings = str.split("\\W+");
        String[][] array = new String[4][4];
        int el = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = strings[el++];
                System.out.print(Integer.parseInt(array[i][j]) + " ");
            }
            System.out.println();
        }
        //Получение суммы и деление результата на 2
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for  (int j = 0; j < array.length; j++) {
                sum += Integer.parseInt(array[i][j]);
            }
            if (i == 3)
                sum /= 2;
        }
        System.out.println("Деление суммы элементов массива на 2 равно:");
        return sum;
    }
}
