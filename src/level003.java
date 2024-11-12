public class level003 {
    public void number001(){
        for (int i=1; i <=100; i++){
            System.out.println(i);
        }
    }

    public void number002(String str){
        if(str.length()>1){
            System.out.println(str.charAt(str.length()-2));
        }
    }

    public int number003(int n1, int n2){
        return n1%n2;
    }

    public void number004(byte n){
        switch (n){
            case 1:
                case 2:
                    case 3:
                        System.out.println("Winter");
                        break;
                        case 4:
                            case 5:
                                case 6:
                                    System.out.println("Spring");
                                    break;
                                    case 7:
                                        case 8:
                                            case 9:
                                                System.out.println("Summer");
                                                break;
                                                case 10:
                                                    case 11:
                                                        case 12:
                                                            System.out.println("Autumn");
                                                            break;
        }
    }
}
