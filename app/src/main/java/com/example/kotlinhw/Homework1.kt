import kotlin.random.Random
fun main() {

val ListOfValues = List(100) { Random.nextInt(0, 100) };
println(ListOfValues);


fun check(Item: Int){
    for (item in ListOfValues) {
       when {
            (item % 3 == 0) && (item % 5 == 0) -> println("Piff & Paff")
            item % 3 == 0 -> println("Piff")
            item % 5 == 0 -> println("Paff")

        }
}

    }



    for (item: Int in ListOfValues) {
        when {
            (item % 3 == 0) && (item % 5 == 0) -> println("Piff & Paff")
            item % 3 == 0 -> println("Piff")
            item % 5 == 0 -> println("Paff")

        }
    }

     for(item in ListOfValues.indices){
      when{
          (item % 3 == 0) && (item % 5 == 0) -> println("Piff & Paff")
          item % 3 == 0-> println("Piff")
      item % 5 == 0-> println("Paff")
  }}


    for ((index, item) in ListOfValues.withIndex()) {

        when {
            (item % 3 == 0) && (item % 5 == 0) -> println("Piff & Paff")
            item % 3 == 0 -> println("Piff")
            item % 5 == 0 -> println("Paff")

        }
    }

    for (item: Int in ListOfValues) {

        check(item);
    }

    for(item in ListOfValues.indices){
        check(item);
    }

    for(item in ListOfValues.indices) {
        check(item);
    }

    for ((index, item) in ListOfValues.withIndex()) {
        check(item);

    }
}