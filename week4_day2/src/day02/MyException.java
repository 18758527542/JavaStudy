package day02;

public class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }

    public static void main(String[] args) {
        try {
            login("jack", "1234");
            System.out.println("恭喜jack登录成功,页面跳转");
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("页面不跳转,请重新登录!");
        }
    }

    public static void login(String name, String password) throws MyException {
        if ("jack".equals(name) && "123".equals(password)) {
            return;
        } else {
            throw new MyException("用户名密码错误!");
        }
    }
}
