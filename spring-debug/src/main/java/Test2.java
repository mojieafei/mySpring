import com.alibaba.fastjson2.JSON;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		Integer[] arr  = {1,28,23,15,541,49,22};
		List<Integer> ints = new ArrayList<>();
		Collections.addAll(ints,arr);
		// 这是我的屏幕共享

//		System.out.println(JSON.toJSON(arr));
//		System.out.println(JSON.toJSON(ints));
		execute(arr, 50);

	}

	public static void printString(String str){
		System.out.println(str);
	}

	public static void execute(Integer[] arr, Integer sum){
		if(arr.length == 0){
			System.out.println("请检查传入参数");
			return;
		}
		TreeMap<Integer, Integer> treeMap = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			treeMap.put(arr[i],i);
		}
		System.out.println(treeMap);
		for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			Integer temp = sum - key;
			if (treeMap.containsKey(temp)) {
				System.out.println("计算出加和为" + sum + "的两个数值索引为 " + value + ", " + treeMap.get(temp));
//				break;
			}
		}
	}

}
