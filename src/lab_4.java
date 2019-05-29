/**
 * Class that represents educational institution
 *
 * @version     1 04 May 2019
 * @author      Oleg Shvachko
 */

import java.util.Arrays;

public class lab_4 {
    public static void main (String[] args) {
        University[]uni = new University[3];
        uni[0] = new University ("Ukraine", "Lviv",
                                "Lviv Polytechnic National University",
                                "Software department", 121);
        uni[1] = new University ("Ukraine", "Kharkiv",
                                 "National Technical University 'Kharkiv Polytechnic Institute'",
                                 "Department of Computer Science and Software Engineering",
                                 126);
        uni[2] = new University ("Ukraine", "Kyiv",
                                 "Taras Shevchnko National University of Kyiv",
                                 "Faculty of computer Science and Cybernetics",
                                 122);

        for (University un : uni){
            System.out.println(un.toString());
        }

        University var;
        for (int i = 0; i < uni.length - 1 ; i++){
            if (uni[i].getSpecialization() > uni[i+1].getSpecialization()) {
                    var = uni[i+1];
                    uni[i+1] = uni[i];
                    uni[i] = var;
            }
        }

        System.out.println("+++++++++++");

        for (University un : uni){
            System.out.println(un.toString());
        }

        System.out.println("+++++++++++");
        Arrays.sort(uni, new ComparatorByCity().reversed());

        for (University un : uni){
            System.out.println(un.toString());
        }

    }
}
//Как работает компаратор, как проверяются больше 1 объекта(как за 1 раз мы проверяем несколько объектов, зачем Overrid-ить в University, зачем нужен отдельный класс для ComparatorByCity