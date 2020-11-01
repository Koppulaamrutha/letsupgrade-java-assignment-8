class Employee{
    
    Scanner sc=new Scanner(System.in);
    
    String name,designation;
    int age,salary;
    
    void getDetails(){
        System.out.println("Enter name:");
        name=sc.nextLine();
        
        System.out.println("Enter age:");
        age=sc.nextInt();
        
        System.out.println("Enter salary:");
        salary=sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Enter designation:");
        designation=sc.nextLine();
    }
    void putDetails(){
        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary+" Designation: "+designation);
    }
}