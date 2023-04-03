fun main(){
    name()
    num(1,2)
nums(1,2,3,4)
fact()

}
fun name() {
    var name = "Hello Ada"
    println(name)
}
fun num(num1:Int,num2:Int){
    var num=num1%num2
    println(num)
}

fun nums(nums1:Int,nums2:Int,nums3:Int,nums4:Int):Int{
 var nums1 =nums1+nums2+nums3+nums4
 return nums1
}
fun fact() {
    var fact = "I love AkiraChix"
    println(fact)
}