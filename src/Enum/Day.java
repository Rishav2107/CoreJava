package Enum;

public enum Day implements Convert {
    MONDAY(1,"1st Day"){
        @Override
        public void display() {
            System.out.println("Monday method");
        }

        @Override
        public void anotherMethod() {
            System.out.println("Mon another method");
        }
    },
    TUESDAY(2,"2nd Day"){
        @Override
        public void anotherMethod() {
            System.out.println("Mon another method");
        }
    },
    WEDNESDAY(3,"3rd Day"){
        @Override
        public void anotherMethod() {
            System.out.println("Mon another method");
        }
    };
    private int value;
    private String comments;

    Day(int value,String comments){
        this.value=value;
        this.comments=comments;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void display(){
        System.out.println("common method");
    }

    @Override
    public void convertString(){
        System.out.println("Convert Method");
    }

    public abstract void anotherMethod();
}
