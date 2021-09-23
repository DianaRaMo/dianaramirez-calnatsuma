package co.s4n.calnat

import scala.io.StdIn

object Main extends App {
	def leerInt (prompt:String):Int = {
		val s = StdIn.readLine(prompt)
		s.toInt
	}

	def esCero(nat:Nat):Boolean = nat match {
		case Cero() => true
		case Suc(nat) => false	
	}

	def conIntANat (i:Int):Nat = 

	def imprimirNat(nat:Nat):String = 

	def sumaNat(nat1:Nat, nat2:Nat):Nat = nat1 + nat2

	def read(prompt: String): (Int, Int) = {
      val s = StdIn.readLine(prompt)
      val ints = strToInts(s)
      (ints(0), ints(1))
    }

	val (a, b) = read("");

	

}
