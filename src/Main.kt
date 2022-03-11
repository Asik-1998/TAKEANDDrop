
    fun main(){
        val array=(0..1000).toList();
        val employees=array.map{"Employ#$it"}
        val fisrt30=employees.take(30);
       // val fisrt30=employees.takeLast(30);
        for (i:String  in fisrt30){

        }
      //  val first40=employees.drop(990)
        val first40=employees.dropLast(990)
        for (j:String in first40){
            println(j)
        }
    }
