public class ConcurrentModificationExceptionSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Solution 1: Using Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Using a new list
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> oddList = new ArrayList<>();
        for(int num : list){
            if(num % 2 != 0){
                oddList.add(num);
            }
        }
        System.out.println("Solution 2: " + oddList);
    }
}