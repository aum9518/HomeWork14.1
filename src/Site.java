public class Site extends Browser {
   private String address;
    private String typeAddress;

    public Site() {
    }

    public Site(String name) {
        super(name);

    }

    public Site(String name, String address, String typeAddress) {
        super(name);
        this.address = address;
        this.typeAddress = typeAddress;
    }

   public String getAddress(){
        return address;
   }
   public void setAddress(String address){
        this.address=address;
   }
   public String getTypeAddress(){
        return typeAddress;
   }
   public  void setTypeAddress(String typeAddress){
        this.typeAddress=typeAddress;
   }

    public String site(){
        return " Go to site";
    }
    public String typeAddres(){
        return "This is coding site";
    }

    @Override
    public String toString() {
        return browser()+", name='" + name + '\''+" Site{" +
                "address='" + address + '\'' +
                ", typeAddress='" + typeAddress + '\'' +
                '}'+site()+" "+typeAddres();
    }
}
