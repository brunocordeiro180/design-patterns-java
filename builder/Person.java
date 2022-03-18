public class Person {
    private String name;
    private int age;
    private boolean isMarried;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.isMarried = builder.isMarried;
    }

    public static class Builder{
        private String name;
        private int age;
        private boolean isMarried;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder married(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isIsMarried() {
        return this.isMarried;
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", isMarried='" + isIsMarried() + "'" +
            "}";
    }
    
}
