package AnimalExample;

    class X {
    public X(int i){
        System.out.println(1);
    }

    class Y extends X{
        public Y(){
            super(2);
            System.out.println(2);
        }
    }
}
