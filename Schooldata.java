public class Schooldata {
    static String gettoppernameingrade(int grade,String Subject){
        String name="Vivek";
        return name;
    }
    static int[] totalcountofboysandgirls(int schoolid){
        int[] count = {102,108};
        return count;
    }
    static void printstudentslist(){
        String name = "Rakesh";
        int USN = 122;
        int age =22;
        double cgpa = 9.3;
        System.out.println(name);
                System.out.println(USN);
                        System.out.println(age);
                                System.out.println(cgpa);

    }
    
    public static void main(String[] args){
        String name =gettoppernameingrade(1, "maths");
        System.out.println(name);
        totalcountofboysandgirls(1);
        printstudentslist();
   }
}

