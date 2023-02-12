package lesson21;

import java.io.*;
import java.util.*;

public class Main {

    public static final String BASED_PATH = "src\\lesson21\\files\\data.txt";
    public static String separatedCharacter = ",";

    public static List<Person> readPeopleFromTheFile(File file) {
        List<Person> people = new ArrayList<>();
        String line;
        String[] personData;

        try (BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))) {
            Person person;
            while ((line = reader.readLine()) != null) {
                person = new Person();
                personData = line.split(separatedCharacter);

                person.setFirstName(personData[0].trim());
                person.setLastName(personData[1].trim());
                person.setSex(personData[2].trim());
                person.setAge(Integer.parseInt(personData[3].trim()));

                people.add(person);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("There is no file with path + " + file.getPath());
            System.exit(0);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        return people;
    }

    public static void rewriteFile(File file, List<Person> people) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.getPath()))) {
            for (Person person : people) {
                writer.write(person.getFirstName() + separatedCharacter + person.getLastName() + separatedCharacter +
                        person.getSex() + separatedCharacter + person.getAge() + "\n");
            }
        } catch (FileNotFoundException exception) {
            System.out.println("There is no file with path + " + file.getPath());
            System.exit(0);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file;
        List<Person> people;
        int ageCount30, maleCount, femaleCount;

        System.out.println("Enter the path of the file");
        file = new File(scanner.nextLine());

        people = readPeopleFromTheFile(file);

        people.sort((p1, p2) -> (p1.getFirstName() + p1.getLastName()).compareTo(p2.getFirstName() + p2.getLastName()));

        rewriteFile(file, people);

        ageCount30 = (int) people.stream().filter(o -> o.getAge() > 30).count();
        maleCount = (int) people.stream().filter(o -> o.getSex().equals("male")).count();
        femaleCount = (int) people.stream().filter(o -> o.getSex().equals("female")).count();

        System.out.println("Count : " + ageCount30);
        System.out.println("Male : " + maleCount);
        System.out.println("Females : " + femaleCount);
    }
}