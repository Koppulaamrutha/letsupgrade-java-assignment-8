class Doctor extends Employee{
    String clinicName,Specialities;
    
    void getDetails(){
        System.out.println("Enter name:");
        name=sc.next();
        
        System.out.println("Enter age:");
        age=sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Enter your clinic name");
        clinicName=sc.nextLine();
        
        System.out.println("Enter your specialities");
        Specialities=sc.nextLine();
    }
    void putDetails(){
        System.out.println("Name: "+name+" Age: "+age+" Clinic : "+clinicName+" Specialities: "+Specialities);
    }
}