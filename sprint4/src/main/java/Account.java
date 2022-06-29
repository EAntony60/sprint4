public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isCorrespondingLength = false;
        boolean isRightAndLeftSpaces = false;
        boolean result = false;

        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
        if ((name.length() >= 3) && (name.length() <= 19)) {isCorrespondingLength = true;}

        if ((name.indexOf(" ") != 0) && (name.lastIndexOf(" ") != name.length()-1)) {} else { isRightAndLeftSpaces = true;}

        if (isCorrespondingLength && !isRightAndLeftSpaces && ((name.indexOf(" ") > 0) && (name.lastIndexOf(" ") != -1) && (name.lastIndexOf(" ") > 0))) {
            result = true;
        } else {
            result = false;
        }

        return result;
//
//
//        if (((name.length() >= 3)
//                && (name.length() <= 19))
//                && (((name.indexOf(" ") == name.lastIndexOf(" "))
//                && (name.indexOf(" ") != 0)
//                && (name.lastIndexOf(" ") != name.length())))) {
//            isCorrespondingLength = true;
//        } else {
//            isCorrespondingLength = false;
//        }
//        return  isCorrespondingLength;
    }

}