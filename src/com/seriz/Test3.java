package com.seriz;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Externalizable
//Serializable 의 인터페이스에 하위 인터페이스
//Serializable과 같은 기능을 하되 좀더 완벽한 제어가 가능하다.
//writeExternal(), readExternal()메소드를 정의 

class DataTest implements Externalizable{

	String name;
	int age;
	
	public DataTest(){}
	
	public DataTest(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override//복원시 호출
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		
		name = (String)in.readObject();
		age = in.readInt();

		System.out.println("externalize.....");
	}

	@Override//직렬화할때 호출
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(age);
		
		System.out.println("externalize.....");
	}

	@Override
	public String toString() {
		return name+": "+age;
	}
	
	
	
}

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
			DataTest ob = new DataTest("배수지1",25);
			DataTest ob1 = new DataTest("배수지2",25);
			DataTest ob2 = new DataTest("배수지3",25);
			DataTest ob3 = new DataTest("배수지4",25);
			DataTest ob4 = new DataTest("배수지5",25);
			
			FileOutputStream fos = new FileOutputStream("d:\\doc\\a3.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ob);
			oos.writeObject(ob1);
			oos.writeObject(ob2);
			oos.writeObject(ob3);
			oos.writeObject(ob4);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\a3.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataTest ob = null;
			while(true){
				ob = (DataTest)ois.readObject();
				if(ob==null){
					break;
				}
				System.out.println(ob);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e);
		}
		
	}

}

























