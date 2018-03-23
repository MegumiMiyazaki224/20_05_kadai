import java.util.Scanner;
import java.util.ArrayList;

public class ColLesson04 {
    public static void main(String[] args) {
        // Wordクラスのインスタンス配列
//        Word[] words = new Word[5];
        ArrayList<Word> words = new ArrayList<>(5);

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
            words.add(wd);
//            words[i].meaning = tmp[1];
            i++;
            System.out.println("次の単語と意味を入力して下さい。eで終了します。");
//            sc  = new Scanner(System.in);
            input = sc.nextLine();

            if(i == 5){
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                System.out.println();
                break;
            }
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
            System.out.println(words.get(x).toString());
        }
        //こっちも配列の件数を持ってくる必要がある
        System.out.println( i + "件、登録しました。");

    }
}

