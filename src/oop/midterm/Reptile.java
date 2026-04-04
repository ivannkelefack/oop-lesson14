package oop.midterm;

public class Reptile extends Animal{
    private  String family;
    private int order;

    public Reptile(int order, String family){
        super();
        this.order = order;
        this.family = family;
    }

    public String crawl() {
        return "I am crawling";
    }
}
