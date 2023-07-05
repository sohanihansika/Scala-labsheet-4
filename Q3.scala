package lab_4

object Q3 {
  def main(args:Array[String])={
    var input_1 = "Benny"
    var input_2 = "Niroshan"
    var input_3 = "Saman"
    var input_4 = "Kumara"

    println(formatNames(input_1, toUpper))
    println(formatNames(input_2, mixFormat))
    println(formatNames(input_3, toLower))
    println(formatNames(input_4, first_last_format))


  }
  
  def toUpper(name: String): String = {
    name.toUpperCase();
  }

  def toLower(name: String): String = {
    name.toLowerCase();
  }

  def mixFormat(name: String): String = {
    var len = name.length;
    name.substring(0, 2).toUpperCase() + name.substring(2, len).toLowerCase();
  }

  def first_last_format(name: String): String = {
    var len = name.length();
    name.substring(0, 1).toUpperCase() + name.substring(1, len - 1).toLowerCase+name.substring(len - 1, len).toUpperCase();
  }

  def formatNames(input: String, formatFn: String => String): String = {
    formatFn(input);
  }

}
