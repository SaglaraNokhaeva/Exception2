import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
    public static void main (String [] args){

    }

    public static String [][] readFile (String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int fileSize = 1;
        String checked = reader.readLine();
        while (checked!=null){
            fileSize++;
            checked = reader.readLine();
        }
        reader.close();


        reader = new BufferedReader(new FileReader(fileName));
        
    }
}

