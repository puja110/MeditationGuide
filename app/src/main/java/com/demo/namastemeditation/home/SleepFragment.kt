package com.demo.namastemeditation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.demo.namastemeditation.R
import com.demo.namastemeditation.home.adapter.SleepFeaturedListAdapter
import com.demo.namastemeditation.home.adapter.SleepPopularListAdapter
import com.demo.namastemeditation.home.model.SleepFeaturedResponse
import com.demo.namastemeditation.home.model.SleepFeaturedResponseList
import com.demo.namastemeditation.home.model.SleepPopularResponse
import com.demo.namastemeditation.home.model.SleepPopularResponseList


class SleepFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_sleep, container, false)

        //featured recycler//
        val featuredRecyclerView = root.findViewById<RecyclerView>(R.id.rvFeatured)
        val layoutManager = LinearLayoutManager(
            requireActivity(),
            LinearLayoutManager.HORIZONTAL,
            false
        )
        featuredRecyclerView.layoutManager = layoutManager
        val fAdapter =
            SleepFeaturedListAdapter(SleepFeaturedResponseList.getModel() as ArrayList<SleepFeaturedResponse>)
        featuredRecyclerView.adapter = fAdapter
        //featured recycler//

        //popular recycler//
        val popularRecyclerView = root.findViewById<RecyclerView>(R.id.rvPopular)
        val pAdapter =
            SleepPopularListAdapter(SleepPopularResponseList.getModel() as ArrayList<SleepPopularResponse>)

        popularRecyclerView.adapter = pAdapter
        //popular recycler//
        return root
    }

    companion object {
        fun newInstance() = SleepFragment()
    }
}