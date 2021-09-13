## このアプリは何を検証するもの？

コントローラーのメソッド名に対してグローバルに一意でない名前を定義したときspringdoc openapiで生成される仕様ファイルで静止されるoperationIdのルールを調べるものです

## はじめに検証の結論

コントローラ名の降順でソートしたあと、メソッド名が重複していた場合、最初は連番なし、次にシンプルにインクリメントしていく連番を付与しています

## 検証した内容のキャプチャ
キャプチャに解説を載せたものを並べますのでキャプチャを上から順番に見ていってください
なお、特に説明することがないのでコントローラ2のキャプチャは省略しています

![openapi_suffix_1_1](./image/openapi_suffix_1_1.png)
![openapi_suffix_1_2](./image/openapi_suffix_1_2.png)
![openapi_suffix_2_1](./image/openapi_suffix_2_1.png)
![openapi_suffix_2_2](./image/openapi_suffix_2_2.png)
![openapi_suffix_3_1](./image/openapi_suffix_3_1.png)
![openapi_suffix_3_2](./image/openapi_suffix_3_2.png)
![openapi_suffix_4_1](./image/openapi_suffix_4_1.png)
![openapi_suffix_4_2](./image/openapi_suffix_4_2.png)
![openapi_suffix_5_1](./image/openapi_suffix_5_1.png)
![openapi_suffix_5_2](./image/openapi_suffix_5_2.png)
