public class checkPalindrome {
    public static void main(String[] args) {
        MyStack<Character> a = new MyStack<>();
        MyStack<Character> b = new MyStack<>();
        MyStack<Character> c = new MyStack<>();
        Character[] charA = {'p','a','l','i','n','d','r','o','m','e'};
        Character[] charB = {'r','a','c','e','c','a','r'};
        Character[] charC = {'A','B','B','A'};
        for (Character character: charA){
            a.push(character);
        }
        for (Character character: charB){
            b.push(character);
        }
        for (Character character: charC){
            c.push(character);
        }
        System.out.println(a);
        System.out.println("Stack a is palindrome: "+ isPalindrome(a));
        System.out.println(b);
        System.out.println("Stack b is palindrome: "+ isPalindrome(b));
        System.out.println(c);
        System.out.println("Stack c is palindrome: "+ isPalindrome(c));
    }
    public static boolean isPalindrome(MyStack<Character> o){
        if (o.isEmpty()){
            return false;
        }
        MyStack<Character> original = new MyStack<>(o);//copy stack for comparing
        MyStack<Character> temp = new MyStack<>(o);//copy stack for reverse
        MyStack<Character> reversed = new MyStack<>();
        while (!temp.isEmpty()){
            reversed.push(temp.pop());
        }
        while (!original.isEmpty()){
            if (original.pop() != reversed.pop()){
                return false;
            }
        }
        return true;
    }
}
