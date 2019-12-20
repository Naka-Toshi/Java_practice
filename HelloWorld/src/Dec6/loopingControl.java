package Dec6;

public class loopingControl {
	public static void main(String args[]) {

		for (int i = 0; i <=6; i++) {
			if (i == 4) {
				continue;
			}
			System.out.print(i+ " ");
		}
		
		//continue ex-2
		int counter = 10;
		while (counter >= 0) {
			if(counter == 7) {
				counter--;
				continue;	
			}
			System.out.print("\n" + counter + " ");
			counter--;
		}
		
		System.out.println();
		//countinue do-while
	int j = 0;
	do {
		if (j == 5) {
			j++;
			continue;
		}
		System.out.print(j+ " ");
			j++;
	} while(j <= 10);
	
	
	System.out.println();
	//break
	
	int num = 0;
	while (num <= 100) {
	System.out.println("value of variable is " +num);
	if (num == 2) {
		break;
	}
	num++;
	}
	System.out.println("Exit while loop");
	

	//break ex-2
int var;
for (var =10; var >= 1; var--) {
	System.out.println("var " +var);
	if (var == 5) {
		break;
	}
}	
System.out.println("Exit for loop");

	//break ex-3
int l =0;
do {
	System.out.println("value " +l);
	if (l == 3) {
		l++;
		break;
	}
	l++;
} while (l <= 10);
System.out.println("Exit do-while loop");

//sawitch
 int a =2;
 switch(a) {
	 case 1:
		 System.out.println("Case 1");
		 break;
	 case 2:
		 System.out.println("case 2");
		 break;
	 case 3:
		 System.out.println("case3");
		 break;
	 default:
		 System.out.println("Default");
 }
 


	
	
	
}	
}

