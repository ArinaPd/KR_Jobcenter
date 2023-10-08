import Jobcenter.*;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        User inspector1 = new Inspector("OMVU","Olena", "Radchenko",
                "+380936114545","Ukraine");

        User unemployed1 = new Unemployed(10, 2022, 121,
                "Alex", "Wox", "+3806922297171", "Ukraine");
        User unemployed2 = new Unemployed(5, 2021, 123,
                "Kate", "Kirschner", "+3809876545588", "Abroad");
        User unemployed3 = new Unemployed(0, 2013, 035,
                "George","Yog","+380637712345", "Abroad");

        Vacancy vacancy1 = new Vacancy("Ecologist","Ukraine", "+380505595454",
                2,101, 300);
        Vacancy vacancy2 = new Vacancy("Software Engineer", "Abroad", "+38076543210",
                0, 121, 1500);
        Vacancy vacancy3 = new Vacancy("Hardware Engineer", "Ukraine", "+3807899876654",
                5,123, 1000);

        List<String> clAddr = new ArrayList<>();
        clAddr.add(unemployed1.address);
        clAddr.add(unemployed2.address);
        clAddr.add(unemployed3.address);

        System.out.println("Ім'я інспектора:"+inspector1.name+"\nПрiзвище інспектора:"+inspector1.surname+"\nТелефон інспектора:"+inspector1.phone);
        MyFrame frame = new MyFrame();
    }


}
