//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    year(1601)

}

fun year(number:Int):Int{

  if (number % 100 == 0){
       println("${number / 100}")

       return number / 100
   }else{
      println("${(number / 100)+1}")
      return (number / 100)+1
  }

}