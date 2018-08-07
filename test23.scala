object Test{
	def main(args:Array[String])={
		//var email = apply("alex","www.zjxblog.com")
		var email = Test("alex","www.zjxblog.com")
		println("apply method called:"+email)
		println("unapply method called:"+unapply(email))
		println("unapply method called:"+unapply("helloworld"))
	}
	def apply(name:String,domain:String)={
		name+"@"+domain;
	}
	def unapply(email:String):Option[(String,String)] = {
		var emails = email split "@"
		if(emails.length==2){
			return Some(emails(0),emails(1))
		}else{
			return None
		}
	}
}
