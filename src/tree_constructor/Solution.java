package tree_constructor;
import java.util.*;

class Solution {

    static class Node {
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static int getElement(String s, int index){
        String[] temp = s.split(",");
        String element = "";
        if (index == 0)
            //the child
            element = temp[0].split("\\(")[1];
        else
            //the parent
            element = temp[1].split("\\)")[0];
        return Integer.parseInt(element);
    }

    public static String TreeConstructor(String[] strArr) {
        Map<Integer, ArrayList<Integer>> parents = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for(String elem : strArr){
            int parent = getElement(elem, 1);
            int child = getElement(elem, 0);

            if(parents.containsKey(parent)) {
                parents.get(parent).add(child);
            }else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(child);
                parents.put(parent,temp);
            }
            if (parents.get(parent).size() > 2)
                return "false";

            if(children.contains(child))
                return "false";
            else{
                children.add(child);
            }
        }
        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        // Scanner s = new Scanner(System.in);
        System.out.print(TreeConstructor(new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"})); //false
        //System.out.print(TreeConstructor(new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"})); //true



    }

}