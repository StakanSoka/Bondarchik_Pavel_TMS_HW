package lesson21;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static final String BASED_PATH = "src\\lesson21\\files\\data.txt";
    public static String separatedCharacter = ",";

    public static void readPeopleFromTheFile(File file, ArrayList<Person> people) {
        String line;
        String[] personData;
        try (BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))) {
            while ((line = reader.readLine()) != null) {
                personData = line.split(separatedCharacter);
                people.add(new Person(personData[0], personData[1],
                        personData[2], Integer.parseInt(personData[3].trim())));
            }

        } catch (FileNotFoundException exception) {
            System.out.println("There is no file with path + " + file.getPath());
            System.exit(0);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void rewriteFile(File file, ArrayList<Person> people) {
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
        ArrayList<Person> people = new ArrayList<>();
        int ageCount30;
        int maleCount;
        int femaleCount;

        System.out.println("Enter the path of the file");
        file = new File(scanner.nextLine());

        readPeopleFromTheFile(file, people);

        people.sort((p1, p2) -> (p1.getFirstName() + p1.getLastName()).compareTo(p2.getFirstName() + p2.getLastName()));

        rewriteFile(file, people);

        ageCount30 = (int) people.stream().filter(o -> o.getAge() > 30).count();
        maleCount = (int) people.stream().filter(o -> o.getSex().trim().equals("male")).count();
        femaleCount = (int) people.stream().filter(o -> o.getSex().trim().equals("female")).count();

        System.out.println("Count : " + ageCount30);
        System.out.println("Male : " + maleCount);
        System.out.println("Females : " + femaleCount);
    }
}
