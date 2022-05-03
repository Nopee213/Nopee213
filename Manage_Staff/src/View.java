public class View {
    public void printStaffDetails(Staff_Model staff){
        String s = "Staff{" +
                "ID=" + staff.getID() +
                ", name='" + staff.getName() + '\'' +
                '}';
        System.out.println(s);
    }
}
