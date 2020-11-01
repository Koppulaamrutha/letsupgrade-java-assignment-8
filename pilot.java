class Pilot extends Employee{
    String trainingInst;
    
    void getDetails(){
        
        super.getDetails();
        
        System.out.println("Enter your training institute-");
        trainingInst=sc.nextLine();
    }
    void putDetails(){
        
        super.putDetails();
        
        System.out.println(" Training Institute: "+trainingInst);
    }
}
