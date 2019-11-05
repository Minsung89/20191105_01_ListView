package com.tjoeum.a20191105_01_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeum.a20191105_01_listview.adapters.PostAdapter
import com.tjoeum.a20191105_01_listview.datas.PostData
import kotlinx.android.synthetic.main.activity_list_view_practice.*

class ListViewPracticeActivity : AppCompatActivity() {

    var postList = ArrayList<PostData>()
    var postAdapter : PostAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view_practice)

        addPosts()
        postAdapter = PostAdapter(this,R.layout.post_list_item,postList)

        postListView.adapter = postAdapter

    }

    fun  addPosts(){
        postList.add(PostData("1 글입니다.","내용을 1번째로 적습니다."))
        postList.add(PostData("2 글입니다.","내용을 2번째로 적습니다."))
        postList.add(PostData("3 글입니다.","내용을 3번째로 적습니다."))
        postList.add(PostData("4 글입니다.","내용을 4번째로 적습니다."))
        postList.add(PostData("5 글입니다.","내용을 5번째로 적습니다."))
        postList.add(PostData("6 글입니다.","내용을 6번째로 적습니다."))
        postList.add(PostData("7 글입니다.","내용을 7번째로 적습니다."))
        postList.add(PostData("8 글입니다.","내용을 8번째로 적습니다."))
        postList.add(PostData("9 글입니다.","내용을 9번째로 적습니다."))

    }
}
