package exercise.chapter_59;

import java.util.List;

public class ListUtils {

    public synchronized static void addList(List<Customer> customers, exercise.chapter_59.Customer newCustomer){
        customers.add(newCustomer);

    }
}
