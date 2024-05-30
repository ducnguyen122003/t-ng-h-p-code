package arraylist;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        CustomArrayList<String> customArrayListString = new CustomArrayList<>();

//        customArrayList.add(1);
//        customArrayList.add(7);
        customArrayListString.add("đâđsd");

//        if (customArrayList.isEmpty()) {
//            System.out.println("ArrayList is empty");
//        } else  {
//            try {
//                System.out.println("Last element: " + customArrayList.getLastElement());
//            } catch (IllegalStateException e) {
//                System.out.println(e.getMessage());
//            }
//        }

        //customArrayList.add(1);
        //customArrayList.add(2);
        //customArrayList.add(3);

        System.out.println("Size of ArrayList: " + customArrayList.size());
        System.out.println("Size of ArrayList: " + customArrayListString.size());

        System.out.println("Last element: " + customArrayList.getLastElement());
        System.out.println("Last element: " + customArrayListString.getLastElement());

        customArrayList.removeLastElement();
        customArrayListString.removeLastElement();

        /*if (customArrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            try {
                System.out.println("Last element after removal: " + customArrayList.getLastElement());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }*/

        System.out.println("Is ArrayList empty? " + customArrayList.isEmpty());
        System.out.println("Is ArrayList empty? " + customArrayListString.isEmpty());
    }
}