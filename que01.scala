
object CaesarCipher {

def main(args: Array[String]): Unit ={
        val alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        def Encrypt(ch: Char, shift: Int, s:String): Char={ 
        s((s.indexOf(ch.toUpper)+shift)%alpha.length);
        }

        def Decrypt (ch: Char, shift: Int, s:String): Char={
        s((s.indexOf(ch)+alpha.length-shift)%alpha.length); 
        }


        def Ciper= (s:String, shift: Int, fun: (Char, Int, String)=>Char)=>{ 
        s.map(fun(_, shift,s));
        }

        val s1=Ciper (alpha,1,Encrypt); 
        println(s1);

        val s2=Ciper (s1,1,Decrypt); println(s2);
    }
}