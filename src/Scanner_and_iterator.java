import java.util.*;

public class Scanner_and_iterator {
    public static void main(String[] args) {
        //Scanner演示
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = myScanner.nextInt();
        System.out.println(a);
        System.out.println("请输入一个浮点数（单精度）");
        float b = myScanner.nextFloat();
        System.out.println(b);
        System.out.println("请输入一个浮点数（双精度）");
        double c = myScanner.nextDouble();
        System.out.println(c);
        System.out.println("请输入一个字符串");
        String d = myScanner.next();
        System.out.println(d);
        System.out.println("请输入一个字符");
        char e = myScanner.next().charAt(0);
        System.out.println(e);
        System.out.println("请输入Hello Hello Java");
        //Java中next()只能获取空格之前的数据
        String f = myScanner.next();
        System.out.println(f);
        myScanner.useDelimiter("\n");
        String g = myScanner.next();
        System.out.println(g);
        //hasNextXxx接收,进行校验
        int h;
        System.out.println("输入一串数字，以任意字符结尾");
        while (myScanner.hasNextInt()) {
            h = myScanner.nextInt();
            System.out.println(h);
        }

        //Collection(单列集合：List、Set))演示
        /*
        1、add：添加单个元素
        2、remove：删除指定元素
        3、contains：查找元素是否存在
        4、size：获取元素个数
        5、isEmpty：判断是否为空
        6、clear：清空
        7、addAll：添加多个元素
        8、containsAll：查找多个元素是否存在
        9、removeAll；删除多个元素
        10、get：获取下表元素
        */
        //遍历
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(5);
        ints.add(6);
        ints.add(2);
        ints.add(4);
        //使用iterator
        Iterator iterator = ints.iterator();
        while (iterator.hasNext()) {
            int o = (int) iterator.next();
        }
        //使用增强for
        for (Object o : ints) {
            int o1 = (int) o;
        }
        //使用普通for
        for (int i = 0; i < ints.size(); i++) {
            Object o = ints.get(i);
        }

        //Map(双列集合：Map)演示
        /*
        1、put：添加
        2、remove：根据键删除映射关系
        3、get：根据键获取值
        4、size：获取元素个数
        5、isEmpty：判断个数是否为0
        6、clear：清除
        7、containsKey：查找键是否存在
        8、getOrDefault(key , 0):有key返回key对应的value否则返回0
         */
        /*
        MapFor
        1、containsKey：查找键是否存在
        2、keySet：获取所有键
        3、entrySet：获取所有关系k-v
        4、valus：获取所有值
         */
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 11);
        hashMap.put(2, 22);
        hashMap.put(3, 33);
        hashMap.put(4, 44);
        hashMap.put(5, 55);

        Set keys = hashMap.keySet();
        Iterator iterator1 = keys.iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            Object value = hashMap.get(key);
        }

        for (Object o : keys) {
            System.out.println(hashMap.get(o));
        }

        Set entrys = hashMap.entrySet();
        for (Object entry : entrys) {
            Map.Entry en = (Map.Entry) entry;
            Object key = en.getKey();
            Object value = en.getValue();
        }

        //String与基本数据类型转换
        //字符串->基本包装类型、包装类 Integer.parseInt(String s);  包装类.parseXxx();
        //基本包装类型、包装类->字符串 String.valueOf(int n);

        //String与字符数组转化
        //字符数组->字符串 两个构造方法 String(char[]); String(char[],int offset,int length);
        //字符串->字符数组 public char[] toCharArray();

        //equals\equalsgnoreCase
        //substring(int a,int b)
        //trim()
        //charArt(int a)
        //replace(char a)
        //split()分割字符串,比如: String[] newStr = str.split("\\s+");以空格分割字符串


    }
}

class ListNodeTest {
    int val;
    ListNodeTest next;

    public ListNodeTest() {

    }

    public ListNodeTest(int val) {
        this.val = val;
    }

    public ListNodeTest(int val, ListNodeTest next) {
        this.val = val;
        this.next = next;
    }
}


