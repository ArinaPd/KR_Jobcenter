package Jobcenter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Unemployed extends User{
    private static int unCount = 0; // Змінна для визначення кількості безробітних
    private int experience; // Стаж безробітного
    private int date; // Дата заповнення анкети
    private int speciality; // Спеціальність безробітного

    public Unemployed(int experience, int date, int speciality, String name, String surname, String phone, String address) throws IOException {
        super(name, surname, phone, address);
        this.experience = experience;
        this.date = date;
        this.speciality = speciality;

        // Створення файлу для збереження даних про безробітного
        File unemployedFile = new File("unemployed" + unCount + "F.txt");
        if (!unemployedFile.exists()) {
            unemployedFile.createNewFile();
        }

        // Запис даних безробітного до файлу
        PrintWriter unemployedPW = new PrintWriter(unemployedFile);
        unemployedPW.println(getName());
        unemployedPW.println(getSurname());
        unemployedPW.println(getPhone());
        unemployedPW.println(getAddress());
        unemployedPW.println(getExperience());
        unemployedPW.println(getDate());
        unemployedPW.println(getSpeciality());
        unemployedPW.close();
        unCount++;
    }

    // Встановлення геттерів та сеттерів для змінних
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Метод для встановлення кількості безробітних (ПОМИЛКА: змінна "unCount" не повинна встановлюватися в цьому методі)
    public String nullUnCount() {
        unCount = 3;
        return null;
    }

    // Метод для відображення інформації про безробітного
    public String showUnemployed() {
        return  "\nДата звернення:" + this.date +
                "\nІм'я безробiтного:" + this.name +
                "\nПрізвище безробiтного:" + this.surname +
                "\nАдреса безробiтного:" + this.address +
                "\nНомер телефону:" + this.phone +
                "\nCпецiальнiсть:" + this.speciality +
                "\nCтаж:" + this.experience;
    }

    // Перевірка, чи є вакансія для даного безробітного за спеціальністю
    public boolean isThereVacancyForSpeciality(List<String> allVacancies) {
        String unemployedSpeciality = String.valueOf(this.getSpeciality());
        for (String vacancy : allVacancies) {
            if (unemployedSpeciality.equals(vacancy)) {
                return true;
            }
        }
        return false;
    }
}
