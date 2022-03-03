package addressBook;
import java.util.ArrayList;
import java.util.List;
public class mainuc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating an empty list and adding objects to them
		List<addUc2>address=new ArrayList<>();
		address.add(new addUc2("Aaru","Johnson","T-street","M.P","Indore",89070,89563874,"aaru@gmmail.com"));
		address.add(new addUc2("Aarul","John","f-street","M.H","Mumbai",89074,99563874,"aarul@gmmail.com"));
		address.add(new addUc2("Ritu","Jaiswal","link road","M.P","Indore",89050,29563874,"ritu@gmmail.com"));
	//prints the list objects in tabular form.
		System.out.println("_____________________________________________________________________________________________________");
		System.out.printf("%5s %10s %10s %8s %5s %12s %16s %17s","FirstName","LastName","Address","State","City","Zip","PhoneNo.","emailid");
		System.out.println();
		System.out.println("_____________________________________________________________________________________________________");
		address.remove("Aaru");
		address.set(2,new addUc2("teja","ohnson","T-street","M.P","Indore",89070,89563874,"aaru@gmmail.com"));
		
		
		//iterates over the list
		for(addUc2 add:address)
		{
			System.out.format("%7s %11s %10s %7s %9s %11s %14s %22s", add.getfirstname(),add.getlastname(),add.getaddress(),add.getstate(),add.getcity(),add.getzip(),add.getphonenumber(),add.getemailid());
			System.out.println();
		}
		System.out.println("____________________________________________________________________________________________________");
	}
}

