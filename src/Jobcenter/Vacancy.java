package Jobcenter;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.List;


public class Vacancy {
    // Змінна для визначення кількості вакансій
    public static int vacCount = 0;

    // Змінні, що визначають вакансію
    private String name;
    private String address;
    private String phone;
    private int experience;
    private int speciality;
    private int salary;


    public Vacancy(String name, String address, String phone, int experience, int speciality, int salary) throws IOException {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.experience = experience;
        this.speciality = speciality;
        this.salary = salary;

        // Запис інформації про вакансію у файл
        File vacancyF = new File("vacancy" + vacCount + "F.txt");
        if (!vacancyF.exists()){
            vacancyF.createNewFile();}

        PrintWriter vacancyPW = new PrintWriter(vacancyF);
        vacancyPW.println(getName());
        vacancyPW.println(getAddress());
        vacancyPW.println(getPhone());
        vacancyPW.println(getExperience());
        vacancyPW.println(getSpeciality());
        vacancyPW.println(getSalary());
        vacancyPW.close();
        vacCount++;
    }

    // Геттери та сеттери для полів класу
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int nullVacCount(){vacCount = 3;
        return vacCount;
    }

    //Метод для визначення популярності адреси вакансії.
    public String showPopularAddressVac(List<String> vacAddr){
        int ukraineCount = 0;
        int abroadCount = 0;
        if (address.equals("Ukraine")) {
            ukraineCount++;
        }
        else {
            abroadCount++;
        }
        if(ukraineCount>abroadCount){
            ukraineCount = 2;
            abroadCount = 1;
            System.out.println("Ukraine - " + ukraineCount + "Abroad - " + abroadCount);
            return "Ukraine - " + ukraineCount + ", Abroad - " + abroadCount;
        }
        else {
            System.out.println("Abroad");
            return "Abroad";
        }
    }

    //Метод для отримання інформації про вакансію у вигляді рядка.
    public String showVacancy(Vacancy vacancy){
        return "\nНазва вакансії:" + this.name +
                "\nАдреса вакансії:" + this.address +
                "\nНомер телефону:" + this.phone +
                "\nПотрiбний стаж:" + this.experience +
                "\nПотрiбна спецiальнiсть:" + this.speciality +
                "\nЗарплатня:" + this.salary + "ус.";
    }


}
