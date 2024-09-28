import javax.print.DocFlavor;

public class StringBufferDemo {
    public static void main(String[] args){

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());


        StringBuffer stringBuffer3 = new StringBuffer(60);
        System.out.println(stringBuffer3.capacity());

        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer2.hashCode());
        System.out.println(stringBuffer2.capacity());

        stringBuffer2.append(" world!"); //Concat => adding(concatenate)world! to stringBuffer
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer2.hashCode());
        System.out.println(stringBuffer2.capacity());

        stringBuffer2.insert(5, " New888888");
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer2.hashCode());
        System.out.println(stringBuffer2.capacity());

        stringBuffer2.delete(2, 14);
        System.out.println(stringBuffer2);
        System.out.println(stringBuffer2.hashCode());
        System.out.println(stringBuffer2.capacity());

    }
}
