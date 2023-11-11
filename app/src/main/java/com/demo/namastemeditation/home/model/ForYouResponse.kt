package com.demo.namastemeditation.home.model

data class ForYouResponse(
    var id: Int,
    var title: String,
    var image: String,
    var time: String,
    var type: String
)

object ForYouResponseList {

    fun getModel(): List<ForYouResponse> {


        val itemModel1 = ForYouResponse(
            1,
            "Your Meditation Companion for Inner Peace",
            "https://picsum.photos/200",
            time = "29 minutes",
            type="stress"
        )

        val itemModel2 = ForYouResponse(
            2,
            "A Starter's Guide to Meditation Mastery",
            "https://picsum.photos/200",
            time = "19 minutes",
            type="stress"
        )


        val itemModel3 = ForYouResponse(
            3,
            "Unlocking the Mysteries",
            "https://picsum.photos/200",
            time = "15 minutes",
            type="sleep"
        )

        val itemModel4 = ForYouResponse(
            4,
            "The Lost Code to Radiant Success",
            "https://picsum.photos/200",
            time = "22 minutes",
            type="sleep"
        )


        val itemModel5 = ForYouResponse(
            5,
            "Unveiling the Secrets of Dazzling Achievement",
            "https://picsum.photos/200",
            time = "14 minutes",
            type="sleep"
        )

        val itemModel6 = ForYouResponse(
            6,
            "Your Beginner's Guide to Mindfulness",
            "https://picsum.photos/200",
            time = "17 minutes",
            type="stress"
        )


        val itemList: ArrayList<ForYouResponse> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        return itemList
    }

}