package Jobcenter;


import java.util.Objects;


public abstract class User {
    public String name; // Ім'я користувача
    public String surname; // Прізвище користувача
    public String phone; // Номер телефону користувача
    public String address; // Адреса користувача


    public User(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }


    // Отримання кількості безробітних
    public int getUnemployedCount() {
        int unCount = 3; // Зафіксована кількість безробітних (тимчасово)
        System.out.println("Кількість безробітних: " + unCount);
        return unCount;
    }


    // Обчислення середньої зарплати
    public String calculateAverageSalary(Vacancy vacancy1, Vacancy vacancy2, Vacancy vacancy3) {
        int average1 = vacancy1.getSalary();
        int average2 = vacancy2.getSalary();
        int average3 = vacancy3.getSalary();
        int summ = average1 + average2 + average3;
        float average = summ / 3.0f; // Додано явне перетворення на тип float
        return String.valueOf(average);
    }


    // Перевірка відповідності спеціальності
    public boolean isMatchingSpeciality(Unemployed unemployed1, Vacancy vacancy1, Vacancy vacancy2, Vacancy vacancy3) {
        int uSpeciality = unemployed1.getSpeciality();
        int v1Speciality = vacancy1.getSpeciality();
        int v2Speciality = vacancy2.getSpeciality();
        int v3Speciality = vacancy3.getSpeciality();
        return (uSpeciality == v1Speciality) || (uSpeciality == v2Speciality) || (uSpeciality == v3Speciality);
    }


    // Підрахунок кількості відповідних безробітних
    public int countMatchingUnemployed(Vacancy vacancy1, Vacancy vacancy2, Vacancy vacancy3,
                                       User unemployed1, User unemployed2, User unemployed3) {
        int counter = 0;
        if (isMatchingSpeciality((Unemployed) unemployed1, vacancy1, vacancy2, vacancy3)) {
            counter++;
        }
        if (isMatchingSpeciality((Unemployed) unemployed2, vacancy1, vacancy2, vacancy3)) {
            counter++;
        }
        if (isMatchingSpeciality((Unemployed) unemployed3, vacancy1, vacancy2, vacancy3)) {
            counter++;
        }
        return counter;
    }
}
