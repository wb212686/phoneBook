import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Дмитрий on 18.08.2016.
 */
public class PhoneBook {
    private static Map<String, ArrayList<String>> phonesMap = new HashMap<String, ArrayList<String>>();

    static {
        phonesMap.put("Иванов И.И." ,  new ArrayList<String>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        phonesMap.put("Петров П.П." ,  new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        phonesMap.put("Сидоров С.С." ,  new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000" )));
        phonesMap.put("Абросимов С.А." ,  new ArrayList<String>(Arrays.asList("+8 800 20 500", "+8 800 20000 600")));
        phonesMap.put("Лазарев А.А." ,  new ArrayList<String>(Arrays.asList("+8 8010 2000 500", "+8 800 2100 600")));
    }

    public static StringBuilder getPhonesByName(String name) throws IOException {
        List<String> phonesList = phonesMap.get(name);
        StringBuilder result = new StringBuilder();
        if (phonesList != null) {
            for (int i = 0; i < phonesList.size(); i++) {
                result = result.append(i + 1).append(".").append(phonesList.get(i)).append("\n");
            }
        } else {
            result = new StringBuilder("такого ФИО в БД нет");
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println(getPhonesByName(name));
    }
}
