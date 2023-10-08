package Jobcenter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;

public class Inspector extends User {
    private String nameDep; // Назва департаменту, де працює інспектор
    public static int inspCount = 0; // Змінна для визначення кількості інспекторів

    //Створення об'єкта - Інспектора із заданими параметрами: назва департаменту, ім'я, прізвище, телефон та адреса.
    public Inspector(String nameDep, String name, String surname, String phone, String address) throws IOException {
        super(name, surname, phone, address);
        this.nameDep = nameDep;

        // Створення файлу для збереження даних про інспектора
        File inspectorsFile = new File("inspectors" + inspCount + "F.txt");
        if (!inspectorsFile.exists()) {
            inspectorsFile.createNewFile();
        }

        // Запис даних інспектора до файлу
        PrintWriter inspectorsPW = new PrintWriter(inspectorsFile);
        inspectorsPW.println(getNameDep());
        inspectorsPW.println(getName());
        inspectorsPW.println(getSurname());
        inspectorsPW.println(getPhone());
        inspectorsPW.println(getAddress());
        inspectorsPW.close();
        inspCount++;
    }

    // Метод повертає назву департаменту, де працює інспектор.
    public String getNameDep() {
        return nameDep;
    }

    //Метод встановлює назву департаменту, де працює інспектор.
    public void setNameDep(String nameDep) {
        this.nameDep = nameDep;
    }

    //Метод повертає кількість інспекторів.
    public int getInspCount() {
        return inspCount;
    }

    //Метод відображає кількість вакансій.
    public void showVacCount(Vacancy vacancy) {
        System.out.println("Кількість вакансій: " + vacancy.nullVacCount());
    }

    // Метод обчислює середню зарплатню у вакансіях.
    public float averageSalary(List<Integer> salaries) {
        float average = 0;
        for (int salary : salaries) {
            average += salary;
        }
        average /= 3;
        return average;
    }

    //Метод підраховує, скільки безробітних можуть отримати роботу за спеціальністю і за адресою проживання.
    public int uCountMatch(Vacancy vacancy1, Vacancy vacancy2, Vacancy vacancy3, Unemployed unemployed1,
                           Unemployed unemployed2, Unemployed unemployed3) {
        int counter = 0;
        if (Objects.equals(vacancy1.getAddress(), unemployed1.getAddress())) {
            if (Objects.equals(vacancy1.getSpeciality(), unemployed1.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy2.getAddress(), unemployed1.getAddress())) {
            if (Objects.equals(vacancy2.getSpeciality(), unemployed1.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy3.getAddress(), unemployed1.getAddress())) {
            if (Objects.equals(vacancy3.getSpeciality(), unemployed1.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy1.getAddress(), unemployed2.getAddress())) {
            if (Objects.equals(vacancy1.getSpeciality(), unemployed2.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy2.getAddress(), unemployed2.getAddress())) {
            if (Objects.equals(vacancy2.getSpeciality(), unemployed2.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy3.getAddress(), unemployed2.getAddress())) {
            if (Objects.equals(vacancy3.getSpeciality(), unemployed2.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy1.getAddress(), unemployed3.getAddress())) {
            if (Objects.equals(vacancy1.getSpeciality(), unemployed3.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy2.getAddress(), unemployed3.getAddress())) {
            if (Objects.equals(vacancy2.getSpeciality(), unemployed3.getSpeciality())) {
                counter++;
            }
        }
        if (Objects.equals(vacancy3.getAddress(), unemployed3.getAddress())) {
            if (Objects.equals(vacancy3.getSpeciality(), unemployed3.getSpeciality())) {
                counter++;
            }
        }
        return counter;
    }

    // Методи для доступу до інших полів користувача наслідника User
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
