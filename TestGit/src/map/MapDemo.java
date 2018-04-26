package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapDemo {

	private List<Integer> list = new ArrayList<Integer>();

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	private void initList() {
		Random rd = new Random();
		for (int i = 0; i < 10; i++) {
			list.add(rd.nextInt(10));
		}
	}

	private void addElement(Map<Integer, Integer> map, Integer element) {
		Integer count = map.get(element);
		if (map.containsKey(element)) {
			map.put(element, count++);
		} else {
			map.put(element, 1);
		}
	}

	private void count(List<Integer> list) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (Integer element : list) {
			addElement(map, element);
			System.out.print(element+ " ");
		}
		List<Integer> listKey = new ArrayList<Integer>(map.keySet());
		System.out.println();
		for (Integer element : listKey) {
			System.out.println("so lan xuat hien phan tu " + element + " la " + map.get(element));
		}
	}

	public static void main(String[] args) {
		System.out.println("demo map aeeee");
		MapDemo demo = new MapDemo();
		demo.initList();
		demo.count(demo.getList());
	}

}
