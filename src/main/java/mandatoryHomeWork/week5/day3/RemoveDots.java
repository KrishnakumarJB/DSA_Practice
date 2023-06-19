package mandatoryHomeWork.week5.day3;

public class RemoveDots {

    public static void main(String[] args) {

        String address = "1.1.1.1";

        System.out.println(deFang(address));

    }

    public static StringBuilder deFang(String address ){

        StringBuilder s1 = new StringBuilder();

        for ( char c : address.toCharArray()  ) {

            if (c == '.') {
                s1.append("[.]");
            } else{
                s1.append(c);
            }

        }

        return s1;


    }
}
