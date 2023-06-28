import java.io.*;

/*Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив. В отдельном
методе нужно будет пройти про структуре данных, если сохранено значение ?, заменить его на
соответсвующее число. Если на каком-то месте встречается символ, отличный от числа или ?,
бросить подходящее исключение. Записать в тот же файл данные с замененными символами ?.
8
 */
public class lesson2 {
    public static void main(String[] args) {

    }

    public static String[][] readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int fileSize = 1;
        String checked = reader.readLine();
        while (checked != null) {
            fileSize++;
            checked = reader.readLine();
        }
        reader.close();


        reader = new BufferedReader(new FileReader(fileName));
        String[][] result = new String[fileSize][2];
        for (int i = 0; i < fileSize; i++) {
            String[] temp = reader.readLine().split("=");
            if (temp[1] != "?") {
                try {
                    int a = Integer.parseInt(temp[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                temp[1] = String.valueOf(temp[0].length());
            }
            result[i][0] = temp[0];
            result[i][1] = temp[1];

        }
        reader.close();
        return result;
    }

    public static void PrintFile(String[][] arr, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < arr.length; i++) {
            StringBuilder temp = new StringBuilder(arr[i][0] + "=" + arr[i][1] + "\n");
            writer.write(temp.toString());
        }
        writer.close();
    }
}

