import java.util.Objects;

public class ListItem {

    private String item_description; // list item description
    private boolean status;  // done status: true if item is completed, false otherwise
    private String due_date;  // due date of a task/list item
    private String reminder_date;  //specific date for a reminder about a task
    private String reminder_time;  // specific time for a reminder about a task


    // default item constructor
    ListItem(){
        this.item_description = "-none-";
        this.due_date = "-none-";
        this.reminder_date = "-none-";
        this.reminder_time = "-none-";
        this.status = false;
    }


    // list item constructors
    ListItem(String itemDescription, boolean status){
        this.item_description = itemDescription;
        this.due_date = "-none-";
        this.reminder_date = "-none-";
        this.reminder_time = "-none-";
        this.status = status;
    }

    ListItem(String itemDescription, String dueDate, boolean status){
        this.item_description = itemDescription;
        this.due_date = dueDate;
        this.reminder_date = "-none-";
        this.reminder_time = "9:00 am";
        this.status = status;
    }

    ListItem(String itemDescription, String dueDate, String reminderDate, String reminderTime, boolean status){
        this.item_description = itemDescription;
        this.due_date = dueDate;
        this.reminder_date = reminderDate;
        this.reminder_time = reminderTime;
        this.status = status;
    }


    public String getItem_description() {
        return this.item_description;
    }

    public boolean getStatus(){
        return this.status;
    }

    public String getDue_date() {
        return this.due_date;
    }

    public String getReminder_date() {
        return this.reminder_date;
    }

    public String getReminder_time() {
        return this.reminder_time;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public void setReminder_date(String reminder_date) {
        this.reminder_date = reminder_date;
    }

    public void setReminder_time(String reminder_time) {
        this.reminder_time = reminder_time;
    }

//    public void addDueDate(String due_date){
//        String date = due_date;
//        ListItem newItem = new ListItem(this.item_description, date, this.status);
//        this.ListItem = newItem;
//    }

    public String toString(){
        return "[ " + this.getItem_description() + " | due date: " + this.getDue_date() + " | reminder: " + this.getReminder_date() + ", " + this.getReminder_time() + " | status: " + this.getStatus() + " ]" ;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        else if(getClass() != obj.getClass()){
            return false;
        }
        ListItem thisItem = (ListItem) obj;
        return item_description.equals(thisItem.getItem_description());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.item_description);
    }


//    public static void main(String[]args){
//
//        ListItem item1 = new ListItem("feed pet", false);
//        System.out.println(item1.getDue_date());
////        item1.setDue_date("24/10/22");
////        item1.setReminder_date("23/10/22");
//        System.out.println(item1);
//
//    }

}
