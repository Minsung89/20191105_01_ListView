package com.tjoeum.a20191105_01_listview.datas

import android.util.Log

class RoomData(roomPrice:Int, roomAddress:String, roomFloor:Int) { //생성자

    var price : Int = roomPrice

    var address : String = roomAddress

    var floor : Int = roomFloor //음수 : 지하, -1층 : 지하1층 0층 : 반지하

    //기본 생성자를 호출 할 때 하는 행동 : init
//    init {
//        //this : RoomData 객체가 가진
//        // 일반 변수 : 파라미터로 들어오는 변수
//        this.price = price
//        this.address = address
//        this.floor = floor
//
//    }

    constructor() : this(0,"미입력",0){
        Log.d("룸데이터","보조생성자(빈칸) 호출")
    }

    constructor(address:String) : this(-1,address,0){
        Log.d("룸데이터","address 호출")
    }
}