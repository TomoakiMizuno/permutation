import java.util.Set;
import java.util.TreeSet;

public class Permutation {

    /** 順列データ格納用リスト(重複排除・リストの昇順に対応) */
    private Set<String> list = new TreeSet<>();

    /**
     * 引数により渡された順列候補値から順列データを文字列として生成します。
     * @param candidate 順列候補値
     * @return 順列文字列データ
     */
    public String create(String candidate) {
        // 順列生成メソッド呼び出し
        create(candidate, "");
        return list.toString();
    }

    /**
     * 順列データを生成します。(内部利用)
     * @param candidate 順列候補値
     * @param permutation 順列値
     */
    private void create(String candidate, String permutation) {
        // 候補値がなくなったら結果をリストに追加して終了
        if (candidate.length() == 0) {
            list.add(permutation);
            return;
        }
        // 候補値を1文字ずつ操作(候補値がなくなるまでループ)
        for (int i = 0; i < candidate.length(); i++) {
            // 順列に加える文字を候補値から追加
            String per = permutation + candidate.charAt(i);
            // 候補値から順列に加える文字を除去
            String can = candidate.substring(0, i) + candidate.substring(i + 1);
            //再帰呼び出し
            create(can, per);
        }
    }
}
