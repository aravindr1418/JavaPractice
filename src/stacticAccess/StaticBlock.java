package stacticAccess;

public class StaticBlock {


        static int a = 45;
        static int b;
  // this block will only run when the first object is created and the class loaded and it only run one time only
        static {
            System.out.println("static block created.");
            b = a*5;
        }

        public static void main(String[] args) {
           StaticBlock obj = new StaticBlock();
            System.out.println(StaticBlock.a+" "+StaticBlock.b);
            StaticBlock.b = StaticBlock.b+3;
            StaticBlock obj2 = new StaticBlock();
            System.out.println(StaticBlock.a + " "+StaticBlock.b);


        }
    }

