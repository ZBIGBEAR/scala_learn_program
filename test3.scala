object Test{
	def main(args:Array[String]){
		for( i <- 0 to 10){
			println(i+"="+fibonac(i));
		}
	}

	def fibonac(n:BigInt): BigInt = {
		if(n <= 3){
			return n;
		}else{
			return fibonac(n-1)+fibonac(n-2);
		}
	}	
}
