import java.util.ArrayList;

public class AL_impl {

   static class Stack{
        ArrayList<Integer> l=new ArrayList<>();
        public  boolean isEmpty(){
            return l.size()==0;
        }

        public void push(int data){
            l.add(data);
        }

        public int pop(){
            if(isEmpty())
            return -1;

            int top=l.get(l.size()-1);
            l.remove(l.size()-1);
            return top;

        }

        public int peek(){
            if(isEmpty())
            return -1;

            return l.get(l.size()-1);

        }




    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);

        
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
    
}
