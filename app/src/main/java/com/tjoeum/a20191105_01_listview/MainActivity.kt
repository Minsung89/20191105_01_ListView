package com.tjoeum.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.tjoeum.a20191105_01_listview.adapters.RoomDataAdapter
import com.tjoeum.a20191105_01_listview.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var roomList = ArrayList<RoomData>()

    var roomAdapter:RoomDataAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addRooms()
        roomAdapter = RoomDataAdapter(this,R.layout.room_list_item,roomList)

        roomListView.adapter = roomAdapter
    }


    fun  sum(num1:Int, num2:Int) : Int {
        return num1 + num2
    }

    fun  sum2(num1:Int, num2:Int) = num1 + num2


    fun addRooms(){
        var room1 = RoomData()
        room1.price = 8000
        room1.address = "마포구 서교동"
        room1.floor = 1

        roomList.add(room1)

        var room2 = RoomData()
        room2.price = 28500
        room2.address = "마포구 서교동"
        room2.floor = 3

        roomList.add(room2)

        var room3 = RoomData()
        room3.price = 12000
        room3.address = "마포구 성산동"
        room3.floor = 5

        roomList.add(room3)

        roomList.add(RoomData(12000,"마포구 망원1동",3))

        roomList.add(RoomData(15000,"마포구 망원동",2))


        roomList.add(RoomData("은평구"))

        for (item in roomList){
            Log.i("roomList", item.toString())
        }
    }


}
