import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
        Word[] words = new Word[10];

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc  = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください

        int i = 0;

        while(!input.equals("e")){
            String[] tmp = new String[2];
            tmp = input.split(" "); // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
            Word wd = new Word(tmp[0], tmp[1]);
            words[i] = wd;
//            words[i].meaning = tmp[1];
            i++;
            System.out.println("次の単語と意味を入力して下さい。eで終了します。");
//            sc  = new Scanner(System.in);
            input = sc.nextLine();
        }





//            for (i = 1; i < 10; i++){
//                System.out.println("次の単語と意味を入力して下さい。eで終了します。");
//                sc  = new Scanner(System.in);
//                input = sc.nextLine();
//
//
//                tmp = input.split(" ");
//
//                words[i].word = tmp[0];
//                words[i].meaning = tmp[1];
//            }


        //登録表示
        //単語が登録されている配列の件数を持ってくる必要がある
        for(int x = 0; x < i; x++){
            System.out.println("単語：" + words[x].getWord() + "　意味：" + words[x].getMeaning());
        }
        //こっちも配列の件数を持ってくる必要がある
        System.out.println( i + "件、登録しました。");

    }
}
