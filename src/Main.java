public class Main {
    public static void main(String[] args) {
        task123();
        task5();
        task6("petrov pyotr petrovich");
        task7();
        task8();

    }

    static void task123() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName+"\n");

        fullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника для заполнения отчета- " + fullName+"\n");

        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        if (fullName.contains("ё")) {
            fullName =  fullName.replace("ё", "е");
        }
        System.out.println(fullName+"\n");
    }

    static void task5() {
       String fullName = "Shurupov Vasily Petrovich";

        String firstName = fullName.substring(fullName.indexOf(" "),fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" "));
        String lastName = fullName.substring(0,fullName.indexOf(" "));
        System.out.println("Имя сотрудника — "+firstName);
        System.out.println("Отчество сотрудника — "+middleName);
        System.out.println("Фамилия сотрудника — "+lastName+"\n");

    }

    static char[] task6(String fullName) {

        char[] fullNameCharArray = fullName.toCharArray();
        fullNameCharArray[0]=Character.toUpperCase(fullNameCharArray[0]);
        fullNameCharArray[fullName.indexOf(" ")+1] = Character.toUpperCase(fullNameCharArray[fullName.indexOf(" ")+1]);
        fullNameCharArray[fullName.lastIndexOf(" ")+1] = Character.toUpperCase(fullNameCharArray[fullName.lastIndexOf(" ")+1]);

        System.out.println(fullNameCharArray);
        System.out.println("\n");
        return(fullNameCharArray);

    }
    static void task7() {
        String one = "135";
        String two = "246";
        String oneTwo = ""; //можно и без этого, просто тестил объект
        char[] oneChar = one.toCharArray();
        char[] twoChar = two.toCharArray();
        StringBuilder sb = new StringBuilder(oneTwo);
        for (int i = 0; i < one.length(); i++) {
            if (oneChar[i] < twoChar[i]) {
                sb.append(oneChar[i]);
                sb.append(twoChar[i]);
            } else {
                sb.append(twoChar[i]);
                sb.append(oneChar[i]);
            }
        }
        System.out.println(sb+"\n"); //сначала пытался вывести oneTwo, но потом понял, что
                                // StringBuilder не изменяет эту строку, а использует в качестве начальных данных
    }

    static void task8() {
        String str = "aabccddefgghiijjkk";
        char[] strChar = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            if (strChar[i]==strChar[i+1]) {
                sb.append(strChar[i]);
            }
        }
        System.out.println(sb);
    }

}