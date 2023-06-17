package cgg.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SampleExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Raj", "Shekar", 21), new Person("Sanju", "Pottabttni", 22),
				new Person("Ajay", "Mahankali", 20), new Person("Vamshi", "Botla", 21));
		// step1 sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLname().compareTo(p2.getLname()));
		// step2 create a method that prints all the elements in the last
		System.out.println("Printing all Persons");
		printAll(people);
		//step3 create a method that prints all persons with last name beginning with  "s"
		System.out.println("-------------------------------------------------");
		System.out.println("Printing all Persons with lname beginning with 'S' ");
		printConditionally(people,p->p.getLname().startsWith("S"),p->System.out.println(p));
		System.out.println("-------------------------------------------------");
        System.out.println("Printing all persons with fname beginning with 'V' ");
        printConditionally(people,p->p.getFname().startsWith("V"),p->System.out.println(p));
        System.out.println("-------------------------------------------------");
        //step4 printing with printCondtionally only
        System.out.println("Printing all persons with printConditonally method");
        printConditionally(people,p->true,p->System.out.println(p));
	}

	private static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
	private static void printConditionally(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consumer) {
		for (Person person : persons) {
			if(predicate.test(person)) {//here lambda is getting invoked(by calling test)
				 consumer.accept(person);
			}
		}
	}
}
