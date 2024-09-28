public class StringBufferAndStringBuilderPerformance {
    public static void main(String[] args){

        StringBuffer stringBuffer = new StringBuffer();
        long bufferStartTime = System.currentTimeMillis();
        for(int i =0; i<10000000; i++){
            stringBuffer.append("Example");
        }
        System.out.println("Time taken by String Buffer: "+(System.currentTimeMillis()-bufferStartTime)+" ms.");

        StringBuilder stringBuilder = new StringBuilder();
        long builderStartTime = System.currentTimeMillis();
        for(int i=0; i<10000000; i++){
            stringBuilder.append("Example");
        }
        System.out.println("Time taken by String Builder: "+(System.currentTimeMillis()-builderStartTime)+" ms.");
    }
}
