package Arrays_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class commonInThreeSorted {

    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        int i = 0;
        int j = 0;
        int k = 0;
        List<Integer> commonList = new ArrayList<>();
        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            if (Objects.equals(arr1.get(i), arr2.get(j)) && Objects.equals(arr2.get(j), arr3.get(k))) {
                commonList.add(arr1.get(i));
                i++;
                j++;
                k++;
            } else if(arr1.get(i)<arr2.get(j)){
                i++;
            }else if(arr1.get(j)<arr2.get(k)) {
                j++;
            }else {
                k++;
            }


        }
        return commonList;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 10, 20, 30 };
        int[] arr2 = { 5, 13, 15, 20 };
        int[] arr3 = { 5, 20 };
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(arr3).boxed().collect(Collectors.toList());

        List<Integer> common
                = commonElements(list1,list2,list3);

        if (common.size() == 0)
            System.out.print(-1);
        for (int i = 0; i < common.size(); i++)
            System.out.print(common.get(i) + " ");
    }
}
