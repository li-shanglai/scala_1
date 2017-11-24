package com.test

/**
  * Created by lishanglai on 2017/11/20.
  */
object ForArrayDemo {

    def main(args: Array[String]): Unit = {
        //初始化一个数组
        val arr = Array(1,2,3,4,5,6,7,8)
        //增强for循环
        for (i <- arr)
            println(i)


        //好用的until会生成一个Range
        //Reverse是将前面生成的Range反转
        for (i <- (0 until arr.length).reverse)
            println(arr(i))
    }

}
