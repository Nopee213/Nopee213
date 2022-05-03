public class Controller {
    private Staff_Model model;
    private View view;

    public Controller(Staff_Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void updateStaff_name(String name){
        model.setName(name);
    }

    public String getStaff_name(){
        return model.getName();
    }

    public void updateStaff_ID(int ID){
        model.setID(ID);
    }

    public int getStaff_ID(){
        return model.getID();
    }

    public void printView(){
        view.printStaffDetails(model);
    }
}
