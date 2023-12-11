package encapsulation;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(" John", 22, "street 1", 50000);
        // System.out.println (employee1.name +":");
        // System.out.println (employee1.age +":");
        //System.out.println (employee1.address +":");
        //System.out.println (employee1.salary +":");


        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

         employee1.setAge(50);
         employee1.setAddress ("Street2");

        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());
        employee1.setAge(0);
        employee1.setSalary(100000);
        System.out.println(employee1.getName());
        System.out.println(employee1.getAge());
        System.out.println(employee1.getAddress());
        System.out.println(employee1.getSalary());

        System.out.println(employee1);

        System.out.println( "Another employee");
        Employee Kate = new Employee( " Kate",25,"street3", 4500);
        System.out.println(Kate);

        Employee[]employees = {employee1, Kate};
        System.out.println ("Print array of employees");

        for(Employee employee:employees) {
            System.out.println (employee);
        }


    }
}
