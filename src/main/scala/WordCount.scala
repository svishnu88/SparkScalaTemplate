import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by vishnu on 13/05/16.
  */
object WordCount {

  def main(args: Array[String]) {
    val conf = new SparkConf()
    conf.setAppName("WordCount")
    val sc = new SparkContext(conf)
    val rdd = sc.textFile(args(0))
    val wc = rdd.flatMap(_.split(",")).map(x => (x,1)).reduceByKey(_+_)
    wc.saveAsTextFile(args(1))
  }

}
