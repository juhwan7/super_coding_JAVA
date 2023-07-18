package exercise.chapter_34;

public class DepartmentStoreSituation {

    public static void main(String[] args) {

        // 전제 상화
        int price = 10_000;// 상품 가격
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer customerIU = new VIPCustomer("아이유");
        Customer[] customersQueue = {
                new Customer("권율"),
                new Customer("이순신"),
                new VIPCustomer("광해군"),
                new VIPCustomer("유성룡"),
                new Customer("김좌진"),
                customerIU,
                customerIU,
                customerIU,
                new Customer("장원영"),
                new Customer("안유진"),
                new VIPCustomer("김혜수"),
                new GolderCustomer("정우영"),
                new GolderCustomer("정우성"),
                new GolderCustomer("손흥민 ")
        };

        // 시나리오

        for (Customer customer : customersQueue) {
            customer.printMyInfo();
            staff.helPayment(customer, price);
            int i = staff.addSalesAmount(price);
            System.out.println(i);
        }

    }

}
