class Engineer extends Employee{
    String companyName;
    
    void getDetails(){
        
        super.getDetails();
        
        System.out.println("Enter company name:");
        companyName=sc.nextLine();
    }
    void putDetails(){
        
        super.putDetails();
        
        System.out.println(" Company Name: "+companyName);
    }
}