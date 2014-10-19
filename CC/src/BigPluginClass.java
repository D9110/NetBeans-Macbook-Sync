    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
     
     
    public class BigPluginClass
    {
     
    private static int totalchars=0,offset=0;
    private static InputStream stream;
    private static byte[] buffer=new byte[1024];

    
    public static void main(String[] args) throws Exception {
    stream=System.in;
    PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out));
    
  
    
    pw.flush();
    pw.close();
    }
     
    private static int readByte() {
    if(totalchars < 0)
    return 0;
    if(offset >= totalchars) {
    offset = 0;
    try
    {
    totalchars = stream.read(buffer);
    }
    catch(IOException e)
    {
    return 0;
    }
    if(totalchars <= 0)
    return -1;
    }
    return buffer[offset++];
    }
    private static int readInt()
    {
    int number=readByte();
    while(eolchar(number))
    number=readByte();
    int sign=1;
    int val=0;
    if(number=='-')
    {
    sign=-1;
    number=readByte();
    }
    do
    {
    if((number<'0')||(number>'9'))
    return 0;
    val*=10;
    val+=(number-'0');
    number=readByte();
    }
    while(!eolchar(number));
    return sign*val;
    }
    private static long readLong()
    {
    int number=readByte();
    while(eolchar(number))
    number=readByte();
    int sign=1;
    long val=0;
    if(number=='-')
    {
    sign=-1;
    number=readByte();
    }
    do
    {
    if((number<'0')||(number>'9'))
    {
    //return sign*val;
    return 0;
    }
    val*=10;
    val+=(number-'0');
    number=readByte();
    }
    while(!eolchar(number));
    return sign*val;
    }
    private static boolean eolchar(int c)
    {
    return c==' '||c=='\n'||c==-1||c=='\r'||c=='\t';
    }
    }


    class IntegerUtils {
    public static long gcd(long a, long b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
    long temp = a % b;
    a = b;
    b = temp;
    }
    return a;
    }
     
    public static int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
    int temp = a % b;
    a = b;
    b = temp;
    }
    return a;
    }
     
    public static int[] generatePrimes(int upTo) {
    boolean[] isPrime = generatePrimalityTable(upTo);
    List<Integer> primes = new ArrayList<Integer>();
    for (int i = 0; i < upTo; i++) {
    if (isPrime[i])
    primes.add(i);
    }
    return CollectionUtils.toArray(primes);
    }
     
    public static boolean[] generatePrimalityTable(int upTo) {
    boolean[] isPrime = new boolean[upTo];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i * i < upTo; i++) {
    if (isPrime[i]) {
    for (int j = i * i; j < upTo; j += i)
    isPrime[j] = false;
    }
    }
    return isPrime;
    }
     
    public static int[] generateDivisorTable(int upTo) {
    int[] divisor = new int[upTo];
    for (int i = 1; i < upTo; i++)
    divisor[i] = i;
    for (int i = 2; i * i < upTo; i++) {
    if (divisor[i] == i) {
    for (int j = i * i; j < upTo; j += i)
    divisor[j] = i;
    }
    }
    return divisor;
    }
     
    public static long powerInFactorial(long n, long p) {
    long result = 0;
    while (n != 0) {
    result += n /= p;
    }
    return result;
    }
     
    public static int sumDigits(CharSequence number) {
    int result = 0;
    for (int i = number.length() - 1; i >= 0; i--)
    result += digitValue(number.charAt(i));
    return result;
    }
     
    public static int digitValue(char digit) {
    if (Character.isDigit(digit))
    return digit - '0';
    if (Character.isUpperCase(digit))
    return digit + 10 - 'A';
    return digit + 10 - 'a';
    }
     
    public static int longCompare(long a, long b) {
    if (a < b)
    return -1;
    if (a > b)
    return 1;
    return 0;
    }
     
    public static long[][] generateBinomialCoefficients(int n) {
    long[][] result = new long[n + 1][n + 1];
    for (int i = 0; i <= n; i++) {
    result[i][0] = 1;
    for (int j = 1; j <= i; j++)
    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
    }
    return result;
    }
     
    public static long[][] generateBinomialCoefficients(int n, long module) {
    long[][] result = new long[n + 1][n + 1];
    if (module == 1)
    return result;
    for (int i = 0; i <= n; i++) {
    result[i][0] = 1;
    for (int j = 1; j <= i; j++) {
    result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
    if (result[i][j] >= module)
    result[i][j] -= module;
    }
    }
    return result;
    }
     
    public static int[] representationInBase(long number, int base) {
    long basePower = base;
    int exponent = 1;
    while (number >= basePower) {
    basePower *= base;
    exponent++;
    }
    int[] representation = new int[exponent];
    for (int i = 0; i < exponent; i++) {
    basePower /= base;
    representation[i] = (int) (number / basePower);
    number %= basePower;
    }
    return representation;
    }
     
    public static int trueDivide(int a, int b) {
    return (a - trueMod(a, b)) / b;
    }
     
    public static int trueMod(int a, int b) {
    a %= b;
    a += b;
    a %= b;
    return a;
    }
     
    public static long trueMod(long a, long b) {
    a %= b;
    a += b;
    a %= b;
    return a;
    }
     
    public static long factorial(int n) {
    long result = 1;
    for (int i = 2; i <= n; i++)
    result *= i;
    return result;
    }
     
    public static List<Pair<Long, Integer>> factorize(long number) {
    List<Pair<Long, Integer>> result = new ArrayList<Pair<Long, Integer>>();
    for (long i = 2; i * i <= number; i++) {
    if (number % i == 0) {
    int power = 0;
    do {
    power++;
    number /= i;
    } while (number % i == 0);
    result.add(Pair.makePair(i, power));
    }
    }
    if (number != 1)
    result.add(Pair.makePair(number, 1));
    return result;
    }
     
    public static List<Long> getDivisors(long number) {
    List<Pair<Long, Integer>> primeDivisors = factorize(number);
    return getDivisorsImpl(primeDivisors, 0, 1, new ArrayList<Long>());
    }
     
    private static List<Long> getDivisorsImpl(List<Pair<Long, Integer>> primeDivisors, int index, long current,
    List<Long> result)
    {
    if (index == primeDivisors.size()) {
    result.add(current);
    return result;
    }
    long p = primeDivisors.get(index).first;
    int power = primeDivisors.get(index).second;
    for (int i = 0; i <= power; i++) {
    getDivisorsImpl(primeDivisors, index + 1, current, result);
    current *= p;
    }
    return result;
    }
     
    public static long power(long base, long exponent) {
    if (exponent == 0)
    return 1;
    long result = power(base, exponent >> 1);
    result = result * result;
    if ((exponent & 1) != 0)
    result = result * base;
    return result;
    }
     
    public static long power(long base, long exponent, long mod) {
    if (base >= mod)
    base %= mod;
    if (exponent == 0)
    return 1 % mod;
    long result = power(base, exponent >> 1, mod);
    result = result * result % mod;
    if ((exponent & 1) != 0)
    result = result * base % mod;
    return result;
    }
     
    public static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
    }
     
    public static long[] generateFibonacci(long upTo) {
    int count = 0;
    long last = 0;
    long current = 1;
    while (current <= upTo) {
    long next = last + current;
    last = current;
    current = next;
    count++;
    }
    return generateFibonacci(count, -1);
    }
     
    public static long[] generateFibonacci(int count, long module) {
    long[] result = new long[count];
    if (module == -1) {
    if (count != 0)
    result[0] = 1;
    if (count > 1)
    result[1] = 1;
    for (int i = 2; i < count; i++)
    result[i] = result[i - 1] + result[i - 2];
    } else {
    if (count != 0)
    result[0] = 1 % module;
    if (count > 1)
    result[1] = 1 % module;
    for (int i = 2; i < count; i++)
    result[i] = (result[i - 1] + result[i - 2]) % module;
    }
    return result;
    }
     
    public static long[] generateHappy(int digits) {
    long[] happy = new long[(1 << (digits + 1)) - 2];
    happy[0] = 4;
    happy[1] = 7;
    int first = 0;
    int last = 2;
    for (int i = 2; i <= digits; i++) {
    for (int j = 0; j < last - first; j++) {
    happy[last + 2 * j] = 10 * happy[first + j] + 4;
    happy[last + 2 * j + 1] = 10 * happy[first + j] + 7;
    }
    int next = last + 2 * (last - first);
    first = last;
    last = next;
    }
    return happy;
    }
     
    public static long[] generateFactorial(int count, long module) {
    long[] result = new long[count];
    if (module == -1) {
    if (count != 0)
    result[0] = 1;
    for (int i = 1; i < count; i++)
    result[i] = result[i - 1] * i;
    } else {
    if (count != 0)
    result[0] = 1 % module;
    for (int i = 1; i < count; i++)
    result[i] = (result[i - 1] * i) % module;
    }
    return result;
    }
     
    public static long reverse(long number, long module) {
    return power(number, module - 2, module);
    }
     
    public static boolean isPrime(long number) {
    if (number < 2)
    return false;
    for (long i = 2; i * i <= number; i++) {
    if (number % i == 0)
    return false;
    }
    return true;
    }
     
    public static long[] generateReverse(int upTo, long module) {
    long[] result = new long[upTo];
    if (upTo > 1)
    result[1] = 1;
    for (int i = 2; i < upTo; i++)
    result[i] = (module - module / i * result[((int) (module % i))] % module) % module;
    return result;
    }
     
    public static long[] generateReverseFactorials(int upTo, long module) {
    long[] result = generateReverse(upTo, module);
    if (upTo > 0)
    result[0] = 1;
    for (int i = 1; i < upTo; i++)
    result[i] = result[i] * result[i - 1] % module;
    return result;
    }
     
    public static long[] generatePowers(long base, int count, long mod) {
    long[] result = new long[count];
    if (count != 0)
    result[0] = 1 % mod;
    for (int i = 1; i < count; i++)
    result[i] = result[i - 1] * base % mod;
    return result;
    }
     
    public static long nextPrime(long from) {
    if (from <= 2)
    return 2;
    from += 1 - (from & 1);
    while (!isPrime(from))
    from += 2;
    return from;
    }
    }
     
    class InputReader1
    {
    private static final long serialVersionUID = 1L;
    private boolean finished = false;
     
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;
     
    public InputReader1(InputStream stream) {
    this.stream = stream;
    }
     
    public int read() {
    if (numChars == -1)
    throw new InputMismatchException();
    if (curChar >= numChars) {
    curChar = 0;
    try {
    numChars = stream.read(buf);
    } catch (IOException e) {
    throw new InputMismatchException();
    }
    if (numChars <= 0)
    return -1;
    }
    return buf[curChar++];
    }
     
    public int peek() {
    if (numChars == -1)
    return -1;
    if (curChar >= numChars) {
    curChar = 0;
    try {
    numChars = stream.read(buf);
    } catch (IOException e) {
    return -1;
    }
    if (numChars <= 0)
    return -1;
    }
    return buf[curChar];
    }
     
    public int readInt() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    int sgn = 1;
    if (c == '-') {
    sgn = -1;
    c = read();
    }
    int res = 0;
    do {
    if (c < '0' || c > '9')
    throw new InputMismatchException();
    res *= 10;
    res += c - '0';
    c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
    }
     
    public long readLong() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    int sgn = 1;
    if (c == '-') {
    sgn = -1;
    c = read();
    }
    long res = 0;
    do {
    if (c < '0' || c > '9')
    throw new InputMismatchException();
    res *= 10;
    res += c - '0';
    c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
    }
     
    public String readString() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    StringBuffer res = new StringBuffer();
    do {
    res.appendCodePoint(c);
    c = read();
    } while (!isSpaceChar(c));
    return res.toString();
    }
     
    public boolean isSpaceChar(int c) {
    if (filter != null)
    return filter.isSpaceChar(c);
    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
     
    private String readLine0() {
    StringBuffer buf = new StringBuffer();
    int c = read();
    while (c != '\n' && c != -1) {
    if (c != '\r')
    buf.appendCodePoint(c);
    c = read();
    }
    return buf.toString();
    }
     
    public String readLine() {
    String s = readLine0();
    while (s.trim().length() == 0)
    s = readLine0();
    return s;
    }
     
    public String readLine(boolean ignoreEmptyLines) {
    if (ignoreEmptyLines)
    return readLine();
    else
    return readLine0();
    }
     
    public BigInteger readBigInteger() {
    try {
    return new BigInteger(readString());
    } catch (NumberFormatException e) {
    throw new InputMismatchException();
    }
    }
     
    public char readCharacter() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    return (char) c;
    }
     
    public double readDouble() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    int sgn = 1;
    if (c == '-') {
    sgn = -1;
    c = read();
    }
    double res = 0;
    while (!isSpaceChar(c) && c != '.') {
    if (c == 'e' || c == 'E')
    return res * Math.pow(10, readInt());
    if (c < '0' || c > '9')
    throw new InputMismatchException();
    res *= 10;
    res += c - '0';
    c = read();
    }
    if (c == '.') {
    c = read();
    double m = 1;
    while (!isSpaceChar(c)) {
    if (c == 'e' || c == 'E')
    return res * Math.pow(10, readInt());
    if (c < '0' || c > '9')
    throw new InputMismatchException();
    m /= 10;
    res += (c - '0') * m;
    c = read();
    }
    }
    return res * sgn;
    }
     
    public boolean isExhausted() {
    int value;
    while (isSpaceChar(value = peek()) && value != -1)
    read();
    return value == -1;
    }
     
    public String next() {
    return readString();
    }
     
    public SpaceCharFilter getFilter() {
    return filter;
    }
     
    public void setFilter(SpaceCharFilter filter) {
    this.filter = filter;
    }
     
    public interface SpaceCharFilter {
    public boolean isSpaceChar(int ch);
    }
    }
     
    class OutputWriter {
    private final PrintWriter writer;
     
    public OutputWriter(OutputStream outputStream) {
    writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }
     
    public OutputWriter(Writer writer) {
    this.writer = new PrintWriter(writer);
    }
     
    public void print(Object...objects) {
    for (int i = 0; i < objects.length; i++) {
    if (i != 0)
    writer.print(' ');
    writer.print(objects[i]);
    }
    }
     
    public void printLine(Object...objects) {
    print(objects);
    writer.println();
    }
     
    public void printLine(char[] array) {
    writer.println(array);
    }
     
    public void printFormat(String format, Object...objects) {
    writer.printf(format, objects);
    }
     
    public void close() {
    writer.close();
    }
     
    public void flush() {
    writer.flush();
    }
    }
     
    class IOUtils {
    public static Pair<Integer, Integer> readIntPair(InputReader1 in) {
    int first = in.readInt();
    int second = in.readInt();
    return Pair.makePair(first, second);
    }
     
    public static Pair<Long, Long> readLongPair(InputReader1 in) {
    long first = in.readLong();
    long second = in.readLong();
    return Pair.makePair(first, second);
    }
     
    public static int[] readIntArray(InputReader1 in, int size) {
    int[] array = new int[size];
    for (int i = 0; i < size; i++)
    array[i] = in.readInt();
    return array;
    }
     
    public static long[] readLongArray(InputReader1 in, int size) {
    long[] array = new long[size];
    for (int i = 0; i < size; i++)
    array[i] = in.readLong();
    return array;
    }
     
    public static double[] readDoubleArray(InputReader1 in, int size) {
    double[] array = new double[size];
    for (int i = 0; i < size; i++)
    array[i] = in.readDouble();
    return array;
    }
     
    public static String[] readStringArray(InputReader1 in, int size) {
    String[] array = new String[size];
    for (int i = 0; i < size; i++)
    array[i] = in.readString();
    return array;
    }
     
    public static char[] readCharArray(InputReader1 in, int size) {
    char[] array = new char[size];
    for (int i = 0; i < size; i++)
    array[i] = in.readCharacter();
    return array;
    }
     
    public static Pair<Integer, Integer>[] readIntPairArray(InputReader1 in, int size) {
    @SuppressWarnings({"unchecked"})
    Pair<Integer, Integer>[] result = new Pair[size];
    for (int i = 0; i < size; i++)
    result[i] = readIntPair(in);
    return result;
    }
     
    public static Pair<Long, Long>[] readLongPairArray(InputReader1 in, int size) {
    @SuppressWarnings({"unchecked"})
    Pair<Long, Long>[] result = new Pair[size];
    for (int i = 0; i < size; i++)
    result[i] = readLongPair(in);
    return result;
    }
     
    public static void readIntArrays(InputReader1 in, int[]... arrays) {
    for (int i = 0; i < arrays[0].length; i++) {
    for (int j = 0; j < arrays.length; j++)
    arrays[j][i] = in.readInt();
    }
    }
     
    public static void readLongArrays(InputReader1 in, long[]... arrays) {
    for (int i = 0; i < arrays[0].length; i++) {
    for (int j = 0; j < arrays.length; j++)
    arrays[j][i] = in.readLong();
    }
    }
     
    public static void readDoubleArrays(InputReader1 in, double[]...arrays) {
    for (int i = 0; i < arrays[0].length; i++) {
    for (int j = 0; j < arrays.length; j++)
    arrays[j][i] = in.readDouble();
    }
    }
     
    public static char[][] readTable(InputReader1 in, int rowCount, int columnCount) {
    char[][] table = new char[rowCount][];
    for (int i = 0; i < rowCount; i++)
    table[i] = readCharArray(in, columnCount);
    return table;
    }
     
    public static int[][] readIntTable(InputReader1 in, int rowCount, int columnCount) {
    int[][] table = new int[rowCount][];
    for (int i = 0; i < rowCount; i++)
    table[i] = readIntArray(in, columnCount);
    return table;
    }
     
    public static double[][] readDoubleTable(InputReader1 in, int rowCount, int columnCount) {
    double[][] table = new double[rowCount][];
    for (int i = 0; i < rowCount; i++)
    table[i] = readDoubleArray(in, columnCount);
    return table;
    }
     
    public static long[][] readLongTable(InputReader1 in, int rowCount, int columnCount) {
    long[][] table = new long[rowCount][];
    for (int i = 0; i < rowCount; i++)
    table[i] = readLongArray(in, columnCount);
    return table;
    }
     
    public static String[][] readStringTable(InputReader1 in, int rowCount, int columnCount) {
    String[][] table = new String[rowCount][];
    for (int i = 0; i < rowCount; i++)
    table[i] = readStringArray(in, columnCount);
    return table;
    }
     
    public static String readText(InputReader1 in) {
    StringBuilder result = new StringBuilder();
    while (true) {
    int character = in.read();
    if (character == '\r')
    continue;
    if (character == -1)
    break;
    result.append((char) character);
    }
    return result.toString();
    }
     
    public static void readStringArrays(InputReader1 in, String[]... arrays) {
    for (int i = 0; i < arrays[0].length; i++) {
    for (int j = 0; j < arrays.length; j++)
    arrays[j][i] = in.readString();
    }
    }
     
    public static void printTable(OutputWriter out, char[][] table) {
    for (char[] row : table)
    out.printLine(new String(row));
    }
    public static void printTable(OutputWriter out, int[][] table) {
    for (int[] row : table) {
    for(int j : row) {
    out.print(j+" ");
    }
    out.printLine();
    }
    }
    }

    
    class ArrayUtils {
    private static int[] tempInt = new int[0];
     
    public static Integer[] generateOrder(int size) {
    Integer[] order = new Integer[size];
    for (int i = 0; i < size; i++)
    order[i] = i;
    return order;
    }
     
    public static void fill(long[][] array, long value) {
    for (long[] row : array)
    Arrays.fill(row, value);
    }
     
    public static void fill(double[][] array, double value) {
    for (double[] row : array)
    Arrays.fill(row, value);
    }
     
    public static void fill(double[][][] array, double value) {
    for (double[][] row : array)
    fill(row, value);
    }
     
    public static void fill(long[][][] array, long value) {
    for (long[][] row : array)
    fill(row, value);
    }
     
    public static void fill(long[][][][] array, long value) {
    for (long[][][] row : array)
    fill(row, value);
    }
     
    public static void fill(long[][][][][] array, long value) {
    for (long[][][][] row : array)
    fill(row, value);
    }
     
    public static void fillColumn(long[][] array, int index, long value) {
    for (long[] row : array)
    row[index] = value;
    }
     
    public static void fillColumn(int[][] array, int index, int value) {
    for (int[] row : array)
    row[index] = value;
    }
     
    public static void fill(int[][] array, int value) {
    for (int[] row : array)
    Arrays.fill(row, value);
    }
     
    public static void fill(boolean[][] array, boolean value) {
    for (boolean[] row : array)
    Arrays.fill(row, value);
    }
     
    public static long sumArray(int[] array) {
    long result = 0;
    for (int element : array)
    result += element;
    return result;
    }
     
    public static int[] range(int from, int to) {
    int[] result = new int[Math.max(from, to) - Math.min(from, to) + 1];
    int index = 0;
    if (to > from) {
    for (int i = from; i <= to; i++)
    result[index++] = i;
    } else {
    for (int i = from; i >= to; i--)
    result[index++] = i;
    }
    return result;
    }
     
    public static void fill(int[][][] array, int value) {
    for (int[][] subArray : array)
    fill(subArray, value);
    }
     
    public static void fill(int[][][][] array, int value) {
    for (int[][][] subArray : array)
    fill(subArray, value);
    }
     
    public static void fill(int[][][][][] array, int value) {
    for (int[][][][] subArray : array)
    fill(subArray, value);
    }
     
    public static Integer[] order(int size, Comparator<Integer> comparator) {
    Integer[] order = generateOrder(size);
    Arrays.sort(order, comparator);
    return order;
    }
     
    public static<T> void fill(T[][] array, T value) {
    for (T[] row : array)
    Arrays.fill(row, value);
    }
     
    public static void fill(char[][] array, char value) {
    for (char[] row : array)
    Arrays.fill(row, value);
    }
     
    public static void fill(byte[][] array, byte value) {
    for (byte[] row : array)
    Arrays.fill(row, value);
    }
     
    public static void fill(byte[][][] array, byte value) {
    for (byte[][] row : array)
    fill(row, value);
    }
     
    public static long multiply(int[] first, int[] second) {
    long result = 0;
    for (int i = 0; i < first.length; i++)
    result += (long)first[i] * second[i];
    return result;
    }
     
    public static int[] createOrder(int size) {
    int[] order = new int[size];
    for (int i = 0; i < size; i++)
    order[i] = i;
    return order;
    }
     
    public static int[] sort(int[] array, IntComparator comparator) {
    return sort(array, 0, array.length, comparator);
    }
     
    public static int[] sort(int[] array, int from, int to, IntComparator comparator) {
    ensureCapacityInt(to - from);
    System.arraycopy(array, from, tempInt, 0, to - from);
    sortImpl(array, from, to, tempInt, 0, to - from, comparator);
    return array;
    }
     
    private static void ensureCapacityInt(int size) {
    if (tempInt.length >= size)
    return;
    size = Math.max(size, tempInt.length << 1);
    tempInt = new int[size];
    }
     
    private static void sortImpl(int[] array, int from, int to, int[] temp, int fromTemp, int toTemp, IntComparator comparator) {
    if (to - from <= 1)
    return;
    int middle = (to - from) >> 1;
    int tempMiddle = fromTemp + middle;
    sortImpl(temp, fromTemp, tempMiddle, array, from, from + middle, comparator);
    sortImpl(temp, tempMiddle, toTemp, array, from + middle, to, comparator);
    int index = from;
    int index1 = fromTemp;
    int index2 = tempMiddle;
    while (index1 < tempMiddle && index2 < toTemp) {
    if (comparator.compare(temp[index1], temp[index2]) <= 0)
    array[index++] = temp[index1++];
    else
    array[index++] = temp[index2++];
    }
    if (index1 != tempMiddle)
    System.arraycopy(temp, index1, array, index, tempMiddle - index1);
    if (index2 != toTemp)
    System.arraycopy(temp, index2, array, index, toTemp - index2);
    }
     
    public static int[] order(final int[] array) {
    return sort(createOrder(array.length), new IntComparator() {
    public int compare(int first, int second) {
    if (array[first] < array[second])
    return -1;
    if (array[first] > array[second])
    return 1;
    return 0;
    }
    });
    }
     
    public static int[] order(final long[] array) {
    return sort(createOrder(array.length), new IntComparator() {
    public int compare(int first, int second) {
    if (array[first] < array[second])
    return -1;
    if (array[first] > array[second])
    return 1;
    return 0;
    }
    });
    }
     
    public static int[] unique(int[] array) {
    return unique(array, 0, array.length);
    }
     
    public static int[] unique(int[] array, int from, int to) {
    if (from == to)
    return new int[0];
    int count = 1;
    for (int i = from + 1; i < to; i++) {
    if (array[i] != array[i - 1])
    count++;
    }
    int[] result = new int[count];
    result[0] = array[from];
    int index = 1;
    for (int i = from + 1; i < to; i++) {
    if (array[i] != array[i - 1])
    result[index++] = array[i];
    }
    return result;
    }
     
    public static int maxElement(int[] array) {
    return maxElement(array, 0, array.length);
    }
     
    public static int maxElement(int[] array, int from, int to) {
    int result = Integer.MIN_VALUE;
    for (int i = from; i < to; i++)
    result = Math.max(result, array[i]);
    return result;
    }
     
    public static int[] order(final double[] array) {
    return sort(createOrder(array.length), new IntComparator() {
    public int compare(int first, int second) {
    return Double.compare(array[first], array[second]);
    }
    });
    }
     
    public static int[] reversePermutation(int[] permutation) {
    int[] result = new int[permutation.length];
    for (int i = 0; i < permutation.length; i++)
    result[permutation[i]] = i;
    return result;
    }
     
    public static void reverse(int[] array) {
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
    }
     
    public static void reverse(char[] array) {
    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
    char temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    }
    }
    }
     
    class CollectionUtils {
    public static int[] toArray(Collection<Integer> collection) {
    int[] array = new int[collection.size()];
    int index = 0;
    for (int element : collection)
    array[index++] = element;
    return array;
    }
     
    public static List<Integer> range(int from, int to) {
    List<Integer> result = new ArrayList<Integer>(Math.max(from, to) - Math.min(from, to) + 1);
    if (to > from) {
    for (int i = from; i <= to; i++)
    result.add(i);
    } else {
    for (int i = from; i >= to; i--)
    result.add(i);
    }
    return result;
    }
     
    public static void rotate(List<Integer> list) {
    list.add(list.remove(0));
    }
     
    public static<T extends Comparable<T>> T minElement(Iterable<T> collection) {
    T result = null;
    for (T element : collection) {
    if (result == null || result.compareTo(element) > 0)
    result = element;
    }
    return result;
    }
     
    public static<T extends Comparable<T>> T maxElement(Iterable<T> collection) {
    T result = null;
    for (T element : collection) {
    if (result == null || result.compareTo(element) < 0)
    result = element;
    }
    return result;
    }
     
    public static<T> T minElement(Iterable<T> collection, Comparator<T> comparator) {
    T result = null;
    for (T element : collection) {
    if (result == null || comparator.compare(result, element) > 0)
    result = element;
    }
    return result;
    }
     
    public static<T> T maxElement(Iterable<T> collection, Comparator<T> comparator) {
    T result = null;
    for (T element : collection) {
    if (result == null || comparator.compare(result, element) < 0)
    result = element;
    }
    return result;
    }
     
    public static<T> List<T> asList(Iterable<T> iterable) {
    List<T> list = new ArrayList<T>();
    for (T element : iterable)
    list.add(element);
    return list;
    }
     
    public static<T> int count(Iterable<T> array, T sample) {
    int result = 0;
    for (T element : array) {
    if (element.equals(sample))
    result++;
    }
    return result;
    }
     
    public static<T> int count(Iterable<T> array, Filter<T> filter) {
    int result = 0;
    for (T element : array) {
    if (filter.accept(element))
    result++;
    }
    return result;
    }
     
    public static<T> List<T> filter(Iterable<T> sequence, Filter<T> filter) {
    List<T> result = new ArrayList<T>();
    for (T element : sequence) {
    if (filter.accept(element))
    result.add(element);
    }
    return result;
    }
     
    public static<A, V> List<V> apply(Iterable<A> sequence, Function<A, V> function) {
    List<V> result = new ArrayList<V>();
    for (A element : sequence)
    result.add(function.value(element));
    return result;
    }
    }
     
    class Pair<U, V> implements Comparable<Pair<U, V>> {
    public final U first;
    public final V second;
     
    public static<U, V> Pair<U, V> makePair(U first, V second) {
    return new Pair<U, V>(first, second);
    }
     
    private Pair(U first, V second) {
    this.first = first;
    this.second = second;
    }
     
    @Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
     
    Pair pair = (Pair) o;
     
    return !(first != null ? !first.equals(pair.first) : pair.first != null) && !(second != null ? !second.equals(pair.second) : pair.second != null);
     
    }
     
    @Override
    public int hashCode() {
    int result = first != null ? first.hashCode() : 0;
    result = 31 * result + (second != null ? second.hashCode() : 0);
    return result;
    }
     
    public Pair<V, U> swap() {
    return makePair(second, first);
    }
     
    @Override
    public String toString() {
    return "(" + first + "," + second + ")";
    }
     
    @SuppressWarnings({"unchecked"})
    public int compareTo(Pair<U, V> o) {
    int value = ((Comparable<U>)first).compareTo(o.first);
    if (value != 0)
    return value;
    return ((Comparable<V>)second).compareTo(o.second);
    }
    }
     
    interface IntComparator {
    public static final IntComparator DEFAULT = new IntComparator() {
    public int compare(int first, int second) {
    if (first < second)
    return -1;
    if (first > second)
    return 1;
    return 0;
    }
    };
     
    public int compare(int first, int second);
    }
     
    interface Filter<T> {
    public boolean accept(T value);
    }
     
    interface Function<A, V> {
    public abstract V value(A argument);
    }
     

