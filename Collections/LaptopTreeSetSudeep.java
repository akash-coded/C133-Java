import java.util.Comparator;
import java.util.TreeSet;

class LaptopDetails {
    int laptopID;
    String brand;
    String processor;
    String storageType;
    int price;

    LaptopDetails(int laptopID, String brand, String processor, String storageType, int price){
        this.laptopID = laptopID;
        this.brand = brand;
        this.processor = processor;
        this.storageType = storageType;
        this.price = price;
    }
}

class ImplementComparator1 implements Comparator<LaptopDetails>{
    @Override
    public int compare(LaptopDetails l1, LaptopDetails l2){
        if(l1.laptopID > l2.laptopID){
            return 1;
        }
        else if(l1.laptopID < l2.laptopID){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class ImplementComparator3 implements Comparator<LaptopDetails>{
    @Override
    public int compare(LaptopDetails l1, LaptopDetails l2){
        if(l1.price < l2.price){
            return 1;
        }
        else if(l1.price > l2.price){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class LaptopTreeSetSudeep{
    public static void main(String[] args) {
        Comparator<LaptopDetails> comp1 = new ImplementComparator1();
        TreeSet<LaptopDetails> tSet = new TreeSet<>(comp1);
        tSet.add(new LaptopDetails(101, "Dell", "i5", "hdd", 50000));
        tSet.add(new LaptopDetails(110, "HP", "i7", "ssd", 80000));
        tSet.add(new LaptopDetails(106, "Apple", "M1", "ssd", 110000));
        for(LaptopDetails laptop : tSet){
            System.out.println(laptop.laptopID + " " + laptop.brand +" "+ laptop.price);
        }

        Comparator<LaptopDetails> comp2 = new Comparator<>(){
            @Override
            public int compare(LaptopDetails l1, LaptopDetails l2){
                if(l1.price > l2.price){
                    return 1;
                }
                else if(l1.price < l2.price){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        };
        tSet = new TreeSet<>(comp2);
        for(LaptopDetails laptop : tSet){
            System.out.println(laptop.laptopID + " " + laptop.brand +" "+ laptop.price);
        }


        Comparator<LaptopDetails> comp3 =
                    (l1, l2) -> {
                        if(l1.price > l2.price){
                            return 1;
                        }
                        else if(l1.price < l2.price){
                            return -1;
                        }
                        else{
                            return 0;
                        }
                    };
        
        tSet = new TreeSet<>(comp3);
        for(LaptopDetails laptop : tSet){
            System.out.println(laptop.laptopID + " " + laptop.brand +" "+ laptop.price);
        }

    }
}