public class level002 {
    
    public int number001(int n) {
        int firstNumber = 0;
        while (n > 0) {
            firstNumber = n % 10;
            n /= 10;
        }
        return firstNumber;
    }

    public int number002(int n) {
        int lastNumber = n % 10;
        return lastNumber;
    }

    public void number003(int n) {
        System.out.println(number001(n) + number002(n));
    }

    public int number004(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public boolean number005(int n1, int n2) {
        return number001(n1) == number001(n2);
    }

}
