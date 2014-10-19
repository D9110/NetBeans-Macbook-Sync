    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;
    
    class BruteTest2
    {
    public static void main(String[] args) throws Exception{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    //int K = Integer.parseInt(r.readLine());
    //for (int i = 0 ; i < K ; i++)
    {
    StringTokenizer st = new StringTokenizer(r.readLine());
    int N = Integer.parseInt(st.nextToken());
    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    long count = 0;
    for (int a = 0 ; a <= A && a <= N ; a++){
    for (int b = 0 ; b <= B && a + b <= N ; b++){
    count += Math.min(N-a-b, C) + 1;
    }
    }
    System.out.println(count);
    }
    }
    } 
//4653255 654 768543 54556
//27463793030240