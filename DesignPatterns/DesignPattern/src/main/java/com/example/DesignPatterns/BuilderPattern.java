package DesignPattern.src.main.java.com.example.DesignPatterns;


import java.util.List;

public class BuilderPattern {
    String bread;
    List<String> sauses;
    List<String> vegies;
    public BuilderPattern()
    {
    }
    public static BuilderPattern createBuilderInstance()
    {
        return new BuilderPattern();
    }
    //this example is for subway
    public BuilderPattern addBun(String bread)
    {
        this.bread=bread;
        return this;
    }
    public BuilderPattern addSause(List<String> sauses)
    {
        this.sauses=sauses;
        return this;
    }
    public BuilderPattern addVeggies(List<String> vegies)
    {
        this.vegies=vegies;
        return this;
    }
    public SubwaySub build()
    {
        return new SubwaySub(bread,sauses,vegies);
    }
}
