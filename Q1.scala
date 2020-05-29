object Q1{
	def main(args:Array[String]){
	if(prime(5)==true){
		println("5 is a Prime Number");
	}
	if(prime(5)==false){
		println("5 is not a Prime Number");
	}
	if(prime(8)==true){
		println("8 is a Prime Number");
	}
	if(prime(8)==false){
		println("8 is not a Prime Number");
	}

}
	def prime(n:Int, i:Int=2):Boolean=n match{
		case x if(x<2) => false;
		case x if(n==2) => true;
		case x if(n%i==0) => false;
		case x if(i*i>n) => true;
		case x =>prime(n,i+1);
}


}
