package andriod;

public class TestForZoo {
    public static void main(String[] args) {
        Zoo Zoo1024 = new Zoo(1000);
        panda panda1 = new panda("小红", 3, "man", 45.00, true);
        shark shark1 = new shark("奥尼尔", 5, "man", 88.00);
        Imbecile imbecile1 = new Imbecile("旺旺", 7, "woman", 78.00);
        tourist tourist1 = new tourist("佩奇", 800, 3);
        tourist tourist2 = new tourist("乔治", 800, 5);
        System.out.println(tourist1);
        System.out.println(tourist2);
        Zoo1024.raise(panda1);
        Zoo1024.raise(shark1);
        Zoo1024.raise(imbecile1);
        Zoo1024.welcome(tourist1);
        Zoo1024.welcome(tourist2);
        Zoo1024.close();
    }
}
