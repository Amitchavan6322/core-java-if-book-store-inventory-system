import com.amit.book.inventory.model.Book;
import com.amit.book.inventory.model.Customer;
import com.amit.book.inventory.model.Supplier;
import com.amit.book.inventory.service.BookService;
import com.amit.book.inventory.service.CustomerService;
import com.amit.book.inventory.service.SupplierService;

import java.util.Scanner;

public class BookStoreInventorySystem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.println("Welcome to the Book Store Inventory System");
            System.out.println("Please select option from below list :");
            System.out.println("1. Fill the book information");
            System.out.println("2. Fill customer information");
            System.out.println("3. Fill supplier information");
            System.out.println("0: Exit project");
            option = Integer.parseInt(sc.nextLine());

            if(option == 1){
                BookService bookService = new BookService();
                Book books = bookService.acceptingBookInfo();

                System.out.println("Books Information :: " + books);
                System.out.println("-----------*****************-----------");
            }

            if (option == 2){
                CustomerService customerService = new CustomerService();
                Customer customer = customerService.acceptingCustomerInfo();

                System.out.println("Customer Information :: " + customer);
                System.out.println("-----------*****************-----------");
            }

            if(option ==3){
                SupplierService supplierService = new SupplierService();
                Supplier supplier = supplierService.acceptingSupplierInformation();

                System.out.println("Supplier Information :: " + supplier);
                System.out.println("-----------*****************-----------");
            }

            if (option !=0 && option != 1 && option != 2 && option != 3){
                System.out.println("Kindly select the valid option");
                System.out.println("-----------*****************-----------");
            }
        }
            while (option != 0);
            System.out.println("THANK YOU!");
    }
}