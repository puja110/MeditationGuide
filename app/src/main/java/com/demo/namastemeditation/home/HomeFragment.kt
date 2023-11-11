package com.demo.namastemeditation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.codebyashish.autoimageslider.AutoImageSlider
import com.codebyashish.autoimageslider.Enums.ImageActionTypes
import com.codebyashish.autoimageslider.Enums.ImageScaleType
import com.codebyashish.autoimageslider.Interfaces.ItemsListener
import com.codebyashish.autoimageslider.Models.ImageSlidesModel
import com.demo.namastemeditation.R
import com.demo.namastemeditation.home.adapter.ForYouListAdapter
import com.demo.namastemeditation.home.model.ForYouResponse
import com.demo.namastemeditation.home.model.ForYouResponseList

class HomeFragment : Fragment(), ItemsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        //auto image slider//
        val autoImageList: ArrayList<ImageSlidesModel> = ArrayList()

        val autoImageSlider = root.findViewById<AutoImageSlider>(R.id.autoImageSlider)
        autoImageList.add(
            ImageSlidesModel(
                "https://picsum.photos/id/870/200/300?grayscale&blur=2",
                "Learn to Motivate Yourself"
            )
        )
        autoImageList.add(
            ImageSlidesModel(
                "https://picsum.photos/id/870/200/300?grayscale&blur=2",
                "Unleashing Your Inner Motivation"
            )
        )
        autoImageList.add(
            ImageSlidesModel(
                "https://picsum.photos/id/870/200/300?grayscale&blur=2",
                "Elevate Your Energy"
            )
        )

        autoImageSlider.setImageList(autoImageList, ImageScaleType.CENTER_CROP)

        autoImageSlider.setDefaultAnimation()
        autoImageSlider.onItemClickListener(this)
        //auto image slider//


        //for you recycler//
        val recyclerView = root.findViewById<RecyclerView>(R.id.rvForYou)
        val adapter =
            ForYouListAdapter(ForYouResponseList.getModel() as ArrayList<ForYouResponse>)

        recyclerView.adapter = adapter
        //for you recycler//

        return root
    }

    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onItemChanged(position: Int) {
    }

    override fun onTouched(actionTypes: ImageActionTypes?, position: Int) {
    }

    override fun onItemClicked(position: Int) {
    }
}