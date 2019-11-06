class Project{
    public String name;
    public String description;
    public String elevatorPitch (){
        return this.name+ " "+this.description;
    }
    public Project() {
this.name = name;
this.description = description;
    }

public Project(String name) {
    this.name = name;
this.description = description;
            System.out.println("name is "+name);


}

public Project(String name, String description) {
this.name = name;
this.description = description;
            System.out.println("name is "+name+" description is "+description);

}
public  void setName (String name){
    this.name = name ;

}
public String getName (String name){
    return name;
}
public  void setDescription (String description){
    this.description = description ;

}
public String getDescription (String description){
    return description;
}

}