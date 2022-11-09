package college;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordManagement {
  LinkedList<Record> list;
  
  public StudentRecordManagement() {
	  list = new LinkedList<>();
  }


public void add(Record record) {
	
	if(!find(record.getIdNumber())) {
		list.add(record);
	}
	else {
		System.out.println("The record already exists");

	}
}

public boolean find(int idNimber) {
	for(Record l : list) {
		if(l.getIdNumber() == idNimber) {
			System.out.println(l);
			return true;
		}
	}
	return false;
}

public void delete(int recIdNumber) {
	Record recordDel = null;
	
	for(Record ll :list) {
		if(ll.getIdNumber() == recIdNumber) {
			recordDel = ll;
		}
	}
	if(recordDel == null) {
		System.out.print("Invalid record Id");
	}
	else {
		list.remove(recordDel);
		
		System.out.println("Successfully removed record");
	}
}
public Record findRecord(int idNumber)
{


   
    for (Record l : list) {

  
        if (l.getIdNumber() == idNumber) {
            return l;
        }
    }

    return null;
}
public void update(int id,Scanner input) {
	if(find(id)) {
		Record rec = findRecord(id);
		System.out.print("What is the new student Id number");
		int idNumber = input.nextInt();
		
		System.out.print("What is the new Studebt contacr Number");
		int contactNumber = input.nextInt();
		input.nextLine();
		System.out.print("Whta is the new Student Name");
		String name = input.nextLine();
		rec.setIdNumber(idNumber);
		rec.setName(name);
		rec.setContactNumber(contactNumber);
		System.out.println("Record updated Successfully");
	}
	else {
		System.out.println("Record not found in the studentlist");
	}
}

public void display() {
	if(list.isEmpty()) {
		System.out.println("The list has no record/n");
	}
	
	for(Record record : list) {
		
		System.out.print(record.toString());
	}
}


    
}