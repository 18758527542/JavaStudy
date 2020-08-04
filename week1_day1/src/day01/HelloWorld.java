package day01;

public class HelloWorld{
	public static void main(String[] args) {
		int a = 11,b = 7;
		int c = a&b;//0000 1011 & 0000 0111  ==  0000 0011
		System.out.println(c);
		
		a = 11; //   0000 1011
		b = -2; //   1111 1110
		        //   0000 1010
		System.out.println(a&b);
		
		a = 20200607;
		b = a&-1;//����a����
		System.out.println(b);
		//num&0 ����0
		System.out.println(11|7);
		System.out.println(11|-2);
		
		System.out.println(11^7);
		System.out.println(11^-2);
		
		System.out.println(~11);
		System.out.println(~-2);
		
		int num = 20200607;
		System.out.println(~num);//-20200608
		
		System.out.println(11>>1);//
		System.out.println(-2>>1);
		
		System.out.println(11>>>1);//
		System.out.println(-2>>>1);
		
		System.out.println(11<<1);//
		System.out.println(-2<<1);
		
		System.out.println(100>>4);
		System.out.println(2<<7);
		
		System.out.println(1<<31);
		System.out.println(~(1<<31));
		
		
		int x = 130;
		int y = 322;
		int z = (x&y)+((x^y)>>1);
		System.out.println(z);
	}

}