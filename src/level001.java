public class level001 {

    public void number001(int n) {
        StringBuilder str = new StringBuilder();
        if (n > 0){
            str.append(n).append(" число положительное.");
        }else {
            str.append(n).append(" число отритальное.");
        }
        System.out.println(str);
    }

    public void number002(String str) {
        System.out.println(str.length());
    }

    public void number003(String str) {
        System.out.println(str.charAt(str.length()-1));
    }

    public void number004(int n) {
        StringBuilder str = new StringBuilder();
        if (n % 2 == 0){
            str.append(n).append(" число четное.");
        }else {
            str.append(n).append(" число нечетное.");
        }
        System.out.println(str);
    }

    public void number005(String str1, String str2) {
        StringBuilder str = new StringBuilder();
        if (str1.charAt(0) ==  str2.charAt(0)) {
            str.append("первые символы совпадают.");
        } else {
            str.append("первые символы несовпадают.");
        }
        System.out.println(str);
    }

    public void number006(String str) {
        if (str.charAt(str.length()-1) == 'ь') {
            System.out.println(str.charAt(str.length()-2));
        } else {
            System.out.println(str.charAt(str.length()-1));
        }
    }



}
