package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Employee> employees = getEmployees();

        //Print names in uppercase
        List<String> names = employees.stream().map(e -> e.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);

        //Sort by salary ascending
        List<Employee> sortedListBySalAsc = employees.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary()).
                collect(Collectors.toList());
        System.out.println(sortedListBySalAsc);

        //Sort by salary descending
        List<Employee> sortedListBySalDesc = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedListBySalDesc);

        //Employee with highest salary
        employees.stream().reduce((e1, e2) -> (e1.getSalary() > e2.getSalary()) ? e1 : e2)
                .ifPresent(System.out::println);

        //Employee with second highest salary
        Optional<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
                .findFirst();
        System.out.println(emp.get());

        Map<String, Long> noOfMaleFemaleEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleFemaleEmployees);

        employees.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);

        System.out.println(employees.stream().filter(e -> e.getAge() >= 30).count());
        System.out.println(employees.stream().filter(e -> e.getName().equals("wfqqgw")).findFirst());
        System.out.println(employees.stream().filter(e -> e.getName().equals("lkk")).findFirst());

        OptionalInt maxAge = employees.stream().mapToInt(e -> e.getAge()).max();
        if (maxAge.isPresent()) {
            System.out.println(maxAge.getAsInt());
        }

        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        System.out.println(employees.stream().map(e -> e.getName()).collect(Collectors.joining(",")));

        //Sum of ages of all employees
        System.out.println(employees.stream().reduce(0, (sumofAges, e) -> sumofAges + e.getAge(), Integer::sum));

        IntSummaryStatistics statistics = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println(statistics);

        List<Event> eventList = getEvents();
        DoubleSummaryStatistics xStats = eventList.stream().collect(Collectors.summarizingDouble(Event::getX));
        DoubleSummaryStatistics yStats = eventList.stream().collect(Collectors.summarizingDouble(Event::getY));
        System.out.println(xStats);
        System.out.println(yStats);



    }

    private static List<Event> getEvents() {
        Event e1 = new Event(23434535, 0.3132424, 223883.34);
        Event e2 = new Event(35535535, 0.7272899, 131331.34);
        Event e3 = new Event(23434535, 0.0202092, 245355.34);
        Event e4 = new Event(23434535, 0.1010100, 244446.34);
        Event e5 = new Event(23434535, 0.1283838, 213551.34);

        List<Event> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        return list;
    }

    private static List<Employee> getEmployees() {
        Employee e1 = new Employee(1, 20, "wfqf", 4402, "f");
        Employee e2 = new Employee(2, 40, "lkk", 6387, "m");
        Employee e3 = new Employee(3, 50, "pwiw", 5381, "m");
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        return list;
    }


}
