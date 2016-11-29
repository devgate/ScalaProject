import org.apache.spark.{SparkConf, SparkContext}

object CountClickLogByService {

  def main(args: Array[String]): Unit = {

    val counter = 0

    val sparkConf = new SparkConf().setAppName("My Spark Job").setMaster("local")
    val sc = new SparkContext(sparkConf)

    val input = sc.textFile("data/2016-04-04_013000_clicklog.txt")

    val pairsByServiceID = input.map( x => (x.split("\t")(2), x))
    val countByKey = pairsByServiceID.sortByKey().countByKey()
    countByKey.foreach(println)

    /*
    val pairsByNormal = input.map( x => (x.split("\t"), x))

    println("[groupByKey]============================================")
    val groupByKey = pairsByServiceID.groupByKey().sortByKey()
    groupByKey.foreach(println)


    println("[reduceByKey]============================================")
    val reduceByKey = pairsByServiceID.reduceByKey((x,y) => x + y).sortByKey()
    reduceByKey.foreach(println)


    println("[countByKey]============================================")
    val countByKey = pairsByServiceID.sortByKey().countByKey()
    countByKey.foreach(println)


*/









  }

}
