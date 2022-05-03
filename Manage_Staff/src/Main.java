public class Main {
    public static void main(String[] args) {

        //create a student
        Staff_Model staff_model = new Staff_Model(1, "KingNope");

        //Create a view : to write staff details on console
        View view = new View();

        Controller controller = new Controller(staff_model, view);

        controller.printView();

        //update model data
        controller.updateStaff_name("Hope");
        controller.updateStaff_ID(2);

        controller.printView();
    }

}
