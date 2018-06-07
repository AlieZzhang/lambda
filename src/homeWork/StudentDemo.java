package homeWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> students =getStu();
		
		//测试输出
		//System.out.println(students);
		//分组
		Map<Integer, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getScore));
		Set<Integer> set = map.keySet();
		//遍历
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer score = iterator.next();
			List<Student> list = map.get(score);
			//输出个数写法一
			//System.out.println(score+"的学生的个数有"+list.size());
			//写法二
			System.out.println(score+"的学生的个数有"+list.stream().count());
			//学生信息
			list.forEach(System.out::println);
			//方便阅读
			System.out.println();
			System.out.println("-----------");
			System.out.println();
		}
	}
	
	
	//创建50个实例并封装到list中
	public static List<Student> getStu(){
		List<Student> students = new ArrayList<Student>();
		for(int i=0;i<50;i++) {
			Student s = new Student();
			s.setSid(i+1);
			s.setSname("GG");
			if(i<7) {
				s.setScore(60);
			}else if(i<14){
				s.setScore(70);
			}else if(i<21){
				s.setScore(75);
			}else if(i<28) {
				s.setScore(80);
			}else if(i<35) {
				s.setScore(85);
			}else if(i<42) {
				s.setScore(90);
			}else if(i<48) {
				s.setScore(95);
			}else {
				s.setScore(100);
			}
			
			students.add(s);
		}
		return students;
	}
	//获取分组的个数
		/*public int getSum() {
			
		}*/
}
