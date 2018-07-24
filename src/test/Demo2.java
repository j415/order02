package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
//		数组：定长
		String arr[] = new String[4];
		arr[0]="a";
		arr[1]="b";
		arr[2]="c";
		arr[3]="d";
//		arr[4]="e"; 报错：数组下标越界
		System.out.println("长度:"+arr.length);
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
//      存储方式：数组
//		集合：长度可变 有序  优点：遍历
		ArrayList list = new ArrayList();
		list.add("A");
		list.add("赵四");
		System.out.println("长度:"+list.size());
		for(int i=0;i<list.size();i++){
			Object o=(String)list.get(i);
			if("赵四".equals(o)){
				
			}
		}
//     思考：100名学生名字，我想找到有没有"赵四"
		
//     HashMap：长度可变 无序
//     存储：Key -value
//			007人
		HashMap map=new HashMap();
		map.put("A", "aaaa");
		map.put("B", "bbbb");
		map.put("C", "cccc");
		map.put("D", "dddd");
		map.put("E", "eeee");
		map.put("F", "ffff");
		map.put("G", "gggg");
		
		System.out.println("长度:"+map.size());
		System.out.println("  "+map.get("A"));
		Set set=map.keySet(); //获得所有的key值
		Iterator it = set.iterator(); //获得迭代器
		while(it.hasNext()){//判断是否有下一个
			String key=(String)it.next();//获得key
			String value=(String)map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
