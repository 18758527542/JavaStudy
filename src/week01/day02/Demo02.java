package week01.day02;

import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args){
        System.out.println("�뿪ʼ���԰ɣ�����-1��Ϸ������");
        Scanner consloe = new Scanner(System.in);
        int code = 0;
        for (int i = 1;i <= 10;i++){
            int a = (int)(Math.random()*100);;
            int b = (int)(Math.random()*100);;
            System.out.print("��"+ i +"��" + a +" + "+ b +" = ");
            int sum = consloe.nextInt();
            if(sum==-1) {
                System.out.println("��Ϸ������");
                break;
            }
            if (sum == a+b){
                System.out.println("����ȷ��");
                code +=10;
            }else{
                System.out.println("�𰸴���");
            }
        }
        System.out.println("���ķ�����"+code+"��");
    }
}
