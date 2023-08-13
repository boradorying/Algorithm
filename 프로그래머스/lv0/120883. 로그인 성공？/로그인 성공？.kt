    class Solution {
        fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
            var answer: String = "fail"

            var id = id_pw[0]
            var pw = id_pw[1]
            for ( i in db.indices){
                if (id == db[i][0] && pw == db[i][1]){
                    answer = "login"
                }else if ( id == db[i][0] && pw != db[i][1]){
                    answer = "wrong pw"
                    break
                }
            }




            return answer
        }
    }