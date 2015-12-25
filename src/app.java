import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: levcandy
 * Date: 12/4/15
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */

/*

1) ()->  System.out.println("Hello from execute");

2) ()-> {

            System.out.println("This is code passed in lambda expression");

            System.out.println("Hello from execute");

        }

3) ()-> {

            System.out.println("This is code passed in lambda expression");

            System.out.println("Hello from execute");

            return 8;

        }

4) () -> {

            return 8;

        }

5) () ->  8

6) (int a) -> {

            System.out.println("Hello from execute");

            return 7 + a;
        }

7)  (a) -> {

            System.out.println("Hello from execute");

            return 7 + a;
        }


8)   int a -> {

            System.out.println("Hello from execute");

            return 7 + a;
        }

9)  (int a, int b) -> {

            System.out.println("Hello from execute");

            return 7 + a;
        }



*/




interface Executable {

    int Execute(int a, int b);
}


interface StringExecutable {

    int Execute(String a);
}

class Runner {

    public void run(Executable e) {

        System.out.println("Executing code block ...");

        int value = e.Execute(12, 13);

        System.out.println("Return value is: " + value);
    }

    public void run(StringExecutable e) {

        System.out.println("Executing code block ...");

        int value = e.Execute("Hello");

        System.out.println("Return value is: " + value);
    }

}


public class app {

    public static void main(String[] args) {

        int mainC = 100;

        Runner runner = new Runner();

        runner.run(new Executable() {

            @Override

            public int Execute(int a , int b) {

                System.out.println("Hello from execute");

                return a + b + mainC;
            }
        });

        System.out.println("=============================");

        runner.run((int a, int b) -> {

            System.out.println("Hello from execute");

            return 7 + a + b + mainC;
        });

        System.out.println("=============================");

        Executable ex = (int a, int b) -> {

            System.out.println("Hello from execute");

            return 7 + a + b + mainC;
        };

        runner.run(ex);


        Object codeblock =  (Executable)(int a, int b) -> {

            System.out.println("Hello from execute");

            return 7 + a + b + mainC;
        };


       Scanner csan;



    }

}
