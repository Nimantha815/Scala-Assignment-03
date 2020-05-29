object Q2{
	def main(args:Array[String]){
		println("Enter a Number:");
		var n = scala.io.StdIn.readInt();
		primeseq(n);
		

}

		def primeseq(a:Int):Unit={
			if(a>0){
			primeseq(a-1);
}
			if(prime(a)!=0){
			println(prime(a));
}
}
	def prime(n:Int, i:Int=2):Int=n match{
		case x if(x<2) =>0;
		case x if(x==2) => x;
		case x if(x%i==0) => 0;
		case x if(i*i>x) => x;
		case x =>prime(x,i+1);
}




}
