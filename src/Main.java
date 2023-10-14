
import javax.swing.JOptionPane;
import java.util.ArrayList;


class Person{
    String name;
    String address;
    String phoneNumber;
    public Person(String n, String a, String p){
        this.name = n;
        this.address = a;
        this.phoneNumber = p;

    }
    // print option
    public void print(){
        JOptionPane.showMessageDialog(null,"Name: " + this.name + "\nAddress: " + this.address + " \nPhoneNumber: " + this.phoneNumber);
    }
}
class AddressBook{
    ArrayList<Person> personList;

    // constructor
    public AddressBook(){
        personList = new ArrayList();
    }

    public void addNew() {
        String nm = JOptionPane.showInputDialog("Enter your Name: ");
        String ad = JOptionPane.showInputDialog("Enter your Address: ");
        String pb = JOptionPane.showInputDialog("Enter your Phone Number: ");

        Person p = new Person(nm, ad, pb);

        personList.add(p);
    }
        public void search_w(String q){
            for(int i=0; i<personList.size(); i++){
                Person p = personList.get(i);//downcasting
                if (p.name.equals(q)){
                    p.print();

                }
        }
    }
    public void delete(String q) {
        for (int i = 0; i < personList.size(); i++) {
            Person p = personList.get(i);//downcasting
            if (p.name.equals(q)) {
                personList.remove(i);
            }
            else if(p.phoneNumber.equals(q)){
                personList.remove(i);
            }

        }
    }

//    public void Present(String q){
//        for (int i = 0; i <personList.size(); i++){
//            Person  p = personList.get(i);
//
//        }
//    }
}

public class Main {
    public static void main(String[] args) {
        AddressBook adb = new AddressBook();
        while(true){
            String s = "Enter 1 for add:\n Enter 2 for search:\n Enter 3 for delete:\n Enter 4 for exit:";
            String input = JOptionPane.showInputDialog(null, s);
            char in = input.charAt(0);

            switch (in){
                case '1':
                    adb.addNew();
                    break;
                case '2':
                  String n1 = JOptionPane.showInputDialog(null,"put Name for search");
                  adb.search_w(n1);
                  break;
                case '3':
                    String n2 = JOptionPane.showInputDialog(null,"put Name for delete");
                    adb.delete(n2);
                    break;

                case '4':
                    System.exit(0);

            }
        }

        }
    }
