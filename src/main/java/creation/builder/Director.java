package creation.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
        builder.buildPart3();
    }
}
