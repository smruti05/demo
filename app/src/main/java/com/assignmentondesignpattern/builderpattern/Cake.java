package com.assignmentondesignpattern.builderpattern;

public class Cake {
    private final double sugar;
    private final double butter;
    private final double flour;
    private final double milk;
    private final int egg;
    private final int vanila;
    private final int cherry;

    public Cake(CakeBuilder cakeBuilder) {
        this.sugar = cakeBuilder.sugar;
        this.butter = cakeBuilder.butter;
        this.egg = cakeBuilder.egg;
        this.vanila = cakeBuilder.vanila;
        this.flour = cakeBuilder.flour;
        this.milk = cakeBuilder.milk;
        this.cherry = cakeBuilder.cherry;
    }

    public static class CakeBuilder {
        private double sugar;
        private double butter;
        private double flour;
        private double milk;
        private int egg;
        private int vanila;
        private int cherry;

        public CakeBuilder sugar(double sugar) {
            this.sugar = sugar;
            return this;
        }
        public CakeBuilder butter(double butter) {
            this.butter = butter;
            return this;
        }
        public CakeBuilder flour(double flour) {
            this.flour = flour;
            return this;
        }
        public CakeBuilder milk(double milk) {
            this.milk = milk;
            return this;
        }
        public CakeBuilder egg(int egg) {
            this.egg = egg;
            return this;
        }
        public CakeBuilder vanila(int vanila) {
            this.vanila = vanila;
            return this;
        }
        public CakeBuilder cherry(int cherry) {
            this.cherry = cherry;
            return this;
        }
        public Cake build(){
            return new Cake(this);
        }
    }
    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butter=" + butter +
                ", flour=" + flour +
                ", milk=" + milk +
                ", egg=" + egg +
                ", vanila=" + vanila +
                ", cherry=" + cherry +
                '}';
    }
}
