public class Browser {
    String name;

    public Browser() {
    }

    public Browser(String name) {
        this.name = name;
    }

    public String browser(){
        return "Browser opened";
    }

    @Override
    public String toString() {
        return "Browser{" +
                "name='" + name + '\'' +
                '}';
    }
}
