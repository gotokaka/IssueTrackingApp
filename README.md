# 概要

『poco-tech at Udemy』さんの動画を見つつ、SpringBootを使ったアプリケーション作成をする為のリポジトリです。

[リンク](https://www.udemy.com/course/intellij-spring-boot/)

## 経緯
RaiseTech第9週課題が行き詰まったこともあり、一度「車輪の再発明」ということでアプリケーションを作成することにした。

---

### 目的
- 作成物をまず作ることでモチベーションの低下を防ぐ。
- 何しら動くものを作ることで流れを把握する。
- 課題と同様の範囲なので課題の「何処で詰まっているのか？」「どの部分を確認すべきか？」を明確にする。
- 各ファイル、コードの動作をイメージ出来るようにし、リサーチ精度をあげるため。


### 環境
- IntelliJ IDEA
- java17
- Spring
- thymeleaf


# 作成したアプリケーションの詳細

<details>
<summary><b>UI</b></summary>

課題管理アプリケーションのトップページ。見た目はこのようになりました。ごく簡易的なものです。
<img width="733" alt="スクリーンショット 2023-07-03 12 22 27" src="https://github.com/gotokaka/IssueTrackingApp/assets/120085564/129d9415-3171-4225-b568-85830cdd830c">

課題一覧画面です。Bootstrapのdocsよりテーブルのデザインを選択しました。
<img width="1762" alt="スクリーンショット 2023-07-03 21 26 41" src="https://github.com/gotokaka/IssueTrackingApp/assets/120085564/00b03236-a863-4e7f-9cad-2d548b154ba5">

課題作成画面です。キャンセルで課題一覧画面に遷移出来ます。
<img width="1778" alt="スクリーンショット 2023-07-03 20 41 32" src="https://github.com/gotokaka/IssueTrackingApp/assets/120085564/1aa54a00-5e76-4474-b719-d16aa4d92780">


</details>


## 動作確認

各操作の動作確認をします。

<details>
<summary><b>トップページから課題一覧の選択</b></summary>
  
![課題管理APP](https://github.com/gotokaka/IssueTrackingApp/assets/120085564/6c6e6f43-d8d4-49cb-92bb-1b3e9f348451)  
トップページから一覧画面に遷移出来ます。

![APP課題詳細](https://github.com/gotokaka/IssueTrackingApp/assets/120085564/cdc66726-1f4c-4bd3-9180-451a2ca8f496)  
一覧画面の各課題を見ることが出来ます

</details>


<details>
<summary><b>課題の作成</b></summary>


![APP課題作成](https://github.com/gotokaka/IssueTrackingApp/assets/120085564/0a9515d2-01cd-43ac-b39d-b77da456c9f1)  
新しい課題を作成出来ます。課題はDBに保存されます。


</details>

<details>
<summary><b>エラーハンドリング</b></summary>

バリデーションによるエラーハンドリングも実装しました。


![APP課題作成文字サイズvali](https://github.com/gotokaka/IssueTrackingApp/assets/120085564/20742dc6-1faa-4332-b5cc-855913bb2a8d)  
文字サイズは256文字で設定しました。上限を超えるとこのようになります。


![APP課題作成vali](https://github.com/gotokaka/IssueTrackingApp/assets/120085564/745cdc2f-b0dd-4572-bdcd-35dd48e9e0fb)  
空文字を打つとエラーが出ます。

</details>


# まとめ
簡易的なアプリケーションではあるが、基礎の基礎がたくさん詰まった良い教材だった。今回取り組んで考えたことをまとめる。
- Javaを使ったアプリケーションで使われるであろう技術の基本を体感的に獲得できた。それによりより発展的な内容の理解の基礎を作れた。
- RaiseTechで学習している内容が殆どだったので、理解の進度も変わっていくと思われる。
- RaiseTechの課題の難易度が相当高いことが分かった。かつ、その難易度をクリアしなければ業界でやっていけない事も改めて自覚した。
- Git管理やGitHubのPRを整える重要性を実感できた。プロジェクトとして進める時に整然としているべき。
- Javaやフレームワークだけでなく、HTMLやDBに関する操作も同時に行うことで、Java学習のみに傾倒するべきではないと感じた。
RaiseeTech課題はその重要性から様々な技術習得を目指すが、敢えて深く触れない場合も多い。そこを自身で調査し気づき自分で学習するということ込みで「自走力」なのかもしれない。
- 初学者に於いての「模倣」は十分な学習になり得る。分からないながらも手を動かし、調べながら論理を理解しようとする並行学習は現在のレベルではまだまだやっても価値はある。
- 加えて、「基本情報技術者試験」の様な資格学習の内容も、コンピューターサイエンスを体系的に学習するものとしては有用である。本アプリ作成で言及されていた概論やロジックを理解する助力にもなった。今後も独学で継続する。

