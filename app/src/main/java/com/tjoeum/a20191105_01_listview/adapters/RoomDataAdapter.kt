package com.tjoeum.a20191105_01_listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeum.a20191105_01_listview.R
import com.tjoeum.a20191105_01_listview.datas.RoomData

class RoomDataAdapter(context:Context, resource:Int, list : ArrayList<RoomData>) : ArrayAdapter<RoomData>(context, resource, list) {

    var mContext:Context? = context
    var mList:ArrayList<RoomData>? = list
    var inf:LayoutInflater? =  LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var row = convertView
        if(row == null){
            row = inf?.inflate(R.layout.room_list_item,null)
        }

        var roomData = mList?.get(position)

        var priceTxt = row?.findViewById<TextView>(R.id.priceTxt)
        var addressAndFloorTxt = row?.findViewById<TextView>(R.id.addressAndFloorTxt)

        priceTxt?.text = roomData?.price.toString()
        addressAndFloorTxt?.text = "${roomData?.address.toString()} ${roomData?.floor.toString()}층"

        return row!!

    }

}