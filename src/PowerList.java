import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PowerList {

    private String powList_name;
    private boolean status;  // done status: true if item is completed, false otherwise
    private LinkedList<SubList> powList;
    private SubList next_sublist;

    PowerList(){
        this.powList_name = "~my-list-1~";
        this.powList = new LinkedList<>();
        this.status = false;
    }

    PowerList(String listName){
        this.powList_name = listName;
        this.powList = new LinkedList<>();
        this.status = false;
    }

    PowerList(String listName, SubList nextSubList){
        this.powList_name = listName;
        this.powList = new LinkedList<>();
        this.next_sublist = nextSubList;
        this.status = false;
    }

    public String getPowList_name() {
        return this.powList_name;
    }

    public void setPowList_name(String powListName) {
        this.powList_name = powListName;
    }

    public void addSublist(SubList thisSublist){
        this.powList.addLast(thisSublist);
    }

    public void addSublist(SubList thisSublist, int index){
        this.powList.add(index, thisSublist);
    }

    public void deleteSubList(SubList thisSublist){
        for(int i = 0; i < powList.size(); i++){
            if(powList.get(i).getSubList_name().equals(thisSublist.getSubList_name())){
                this.powList.remove(powList.get(i));
                break;
            }
        }
    }

    public void deleteSubList(int index){
        this.powList.remove(index);
    }

    public void clearPowerList(){
        this.powList.clear();
    }

    public String detailToString(){
        System.out.println("----" + getPowList_name() + "----");
        System.out.println(" ");
        for (SubList thisList: this.powList) {
            System.out.println(thisList.toString());
        }
        System.out.println("-------------------------");
//        System.out.println(" ");
        return "";
    }

    public static void main(String[]args){

        PowerList testPower = new PowerList("my_first_power_list");
        SubList sub1 = new SubList("sub1");
        SubList sub2 = new SubList("sub2");
        SubList sub3 = new SubList("sub3");

        ListItem item1 = new ListItem("feed pet", false);
        ListItem item2 = new ListItem("buy water", false);
        ListItem item3 = new ListItem("finish code", false);

        sub1.addListItem(item1);
        sub1.addListItem(item2);
        sub2.addListItem(item2);
        sub2.addListItem(item1);
        sub3.addListItem(item3);

        testPower.addSublist(sub1);
        testPower.addSublist(sub3, 1);
        testPower.addSublist(sub2, 2);

        System.out.println(testPower.detailToString());


    }
}
