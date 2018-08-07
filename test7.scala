import java.util.Date
object Test{
	def main(args:Array[String]){
		val date = new Date;
		val logWithDateBound = log(date,_:String);
		logWithDateBound("message1");
		Thread.sleep(1000);
		logWithDateBound("message2");
		Thread.sleep(2000);
		logWithDateBound("message3");
	}

	def log(date:Date,msg:String) = {
		println(date+":"+msg)
	}
}
