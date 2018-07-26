import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {

        Person LilKid1 = new Person();
        Person LilKid2 = new Person();
        Person LilKid3 = new Person();

        LilKid1.setWeight(45);
        LilKid1.setHeight(5);
        System.out.println(LilKid1.bodyMassIndex());

        LilKid2.setWeight(89);
        LilKid2.setHeight(3);
        System.out.println(LilKid2.bodyMassIndex());

        LilKid3.setWeight(12);
        LilKid3.setHeight(8);
        System.out.println(LilKid3.bodyMassIndex());
        String[] arrayOfPeople={"LilKid1","LilKid2","LilKid3"};
        ArrayList<String> pesrsonArray= new ArrayList<>();
        pesrsonArray.addAll(Arrays.asList(arrayOfPeople));
        LilKid2.printPerson();

    }

}
