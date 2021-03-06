class Dog extends  Animal{
    public String name;
    public int run;
    public int sweem;
    public double jump;

    public Dog(String name, int run, int sweem, double jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("Dog name" + name + run + sweem + jump);
    }
}



