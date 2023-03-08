import java.util.ArrayList;

public class SubList {

    private String sublist_name;
    private int sublist_size;
    private boolean status;  // done status: true if item is completed, false otherwise
    private ArrayList<ListItem> this_sublist;

    SubList(){
        this.sublist_name = "-this_subList";
        this.sublist_size = 3;
        this.this_sublist = new ArrayList<>(sublist_size);
        this.status = false;
    }

    SubList(String sublistName){
        this.sublist_name = sublistName;
        this.sublist_size = 3;
        this.this_sublist = new ArrayList<>(sublist_size);
        this.status = false;
    }

    SubList(String sublistName, int sublistSize){
        this.sublist_name = sublistName;
        this.sublist_size = sublistSize;
        this.this_sublist = new ArrayList<>(sublistSize);
        this.status = false;
    }

    public String getSubList_name() {
        return this.sublist_name;
    }

    public int getSubList_size() {
        return this.sublist_size;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getThisSublist() {
        return this.this_sublist.toString();
    }

    public void setSublist_name(String sublist_name) {
        this.sublist_name = sublist_name;
    }

    public void setThis_sublist(ArrayList<ListItem> this_sublist) {
        this.this_sublist = this_sublist;
    }

    public void setSublist_size(int sublist_size) {
        this.sublist_size = sublist_size;
    }

    @Override
    public String toString(){
        System.out.println(this.getSubList_name() + " | status: " + this.getStatus());
        System.out.println("---");
        for(int i = 0; i < this_sublist.size(); i++){
            ListItem thisItem = this_sublist.get(i);
            System.out.println(thisItem.toString());
        }
        System.out.println("---");
        System.out.println(" ");
        return "";
    }

    public void addListItem(ListItem thisItem){
        this.this_sublist.add(thisItem);
    }

    public void addListItem(ListItem thisItem, int index){
        this.this_sublist.add(index, thisItem);
    }

    public void deleteListItem(ListItem thisItem){
        for(int i = 0; i < this_sublist.size(); i++){
            if(thisItem.getItem_description().equals(this_sublist.get(i).getItem_description())){
                this_sublist.remove(this_sublist.get(i));
            }
        }
    }

    public void clearList(){
        this_sublist.clear();
    }


//    public static void main(String[]args){
//
//        SubList sub1 = new SubList("testSub1");
//        SubList sub2 = new SubList("testSub2", 1);
//        ListItem item1 = new ListItem("feed pet", false);
//        ListItem item2 = new ListItem("buy water", false);
//
//        sub1.addListItem(item1);
//        sub1.addListItem(item2);
//        item1.setStatus(true);
//        item2.setStatus(true);
//
//        sub2.addListItem(item2);
//        sub2.addListItem(item1);
//
//        System.out.println(sub1);
//        System.out.println(sub2);
//
//    }
}
