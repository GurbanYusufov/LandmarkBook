package com.example.landmarkbook

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList= ArrayList<Landmark>()

        val qizQalasi=Landmark("Qiz qalasi","Azerbaycan",R.drawable.qizqalasi)
        val sirvansahlar=Landmark("Sirvansahlar Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val aaaa=Landmark("aaaa Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val bbbb=Landmark("bbbb Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val cccc=Landmark("cccc Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val dddd=Landmark("dddd Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val eeee=Landmark("eeee Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val ffff=Landmark("ffff Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val gggg=Landmark("gggg Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val tttt=Landmark("tttt Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val qqqq=Landmark("qqqq Sarayi","Azerbaycan",R.drawable.qizqalasi)
        val llll=Landmark("llll Sarayi","Azerbaycan",R.drawable.qizqalasi)
        landmarkList.add(qizQalasi)
        landmarkList.add(sirvansahlar)
        landmarkList.add(aaaa)
        landmarkList.add(bbbb)
        landmarkList.add(cccc)
        landmarkList.add(dddd)
        landmarkList.add(eeee)
        landmarkList.add(ffff)
        landmarkList.add(gggg)
        landmarkList.add(tttt)
        landmarkList.add(qqqq)
        landmarkList.add(llll)


        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter



    }
}