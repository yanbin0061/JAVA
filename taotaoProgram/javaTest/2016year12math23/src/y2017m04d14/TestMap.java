package y2017m04d14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * ѧϰMap��
 * @author Administrator
 *
 */
public class TestMap {
	@Test
	public void fun1(){
		Map<Integer, Student> classrooms = new HashMap<Integer, Student>();
		Student s1 = new Student();
		//s1.setId();
		s1.setName("����");
		s1.setAge(18);
		s1.setAddress("China");
		//classrooms.put(1, s1);
		for (int i = 0; i < 10; i++) {
			s1.setId(i);
			classrooms.put(i, s1);
			System.out.println(classrooms);
		}
		//�Ƴ�����
		classrooms.remove(1);
		System.out.println("----------------------");
		System.out.println(classrooms);
		//ʹ�õ�������������
		System.out.println("----------------------");
		Iterator<Entry<Integer, Student>> iterator = classrooms.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
			
		}
	}
}
