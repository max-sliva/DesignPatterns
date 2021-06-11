fun main(){
    val mySingle1 = Singleton.instance
    val mySingle2 = Singleton.instance
    mySingle1?.field = 5
    println("mySingle2.field = ${mySingle2?.field}")
}