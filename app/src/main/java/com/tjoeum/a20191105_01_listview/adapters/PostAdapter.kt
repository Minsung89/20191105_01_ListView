package com.tjoeum.a20191105_01_listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tjoeum.a20191105_01_listview.R
import com.tjoeum.a20191105_01_listview.datas.PostData

class PostAdapter (context : Context, res : Int, postList : ArrayList<PostData>) : ArrayAdapter<PostData>(context,res,postList){

    var mContext = context
    var list = postList
    var inf = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var row = convertView
        if(row == null)
            row = inf.inflate(R.layout.post_list_item,null)




        return row!!




    }



}