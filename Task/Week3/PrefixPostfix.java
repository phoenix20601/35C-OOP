public class PrefixPostfix{
    public static void main(String[] args){
        /*Prefix, operator on te left side*/


        int prefixvalue=10;
        System.out.println("Prefix value changes here" + ++prefixvalue);
        System.out.println("Prefix remains same" + prefixvalue);

        /**Postfix, operator on the right side */
        int postFixvalue=20;
        System.out.println("Prefix value changes here" + postFixvalue++);
        System.out.println("Prefix remains same" + postFixvalue);
    }
}