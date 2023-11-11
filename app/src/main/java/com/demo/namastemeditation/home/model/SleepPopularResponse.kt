package com.demo.namastemeditation.home.model

data class SleepPopularResponse(
    var id: Int,
    var title: String,
    var image: String,
    var time: String,
)

object SleepPopularResponseList {

    fun getModel(): List<SleepPopularResponse> {

        val itemModel1 = SleepPopularResponse(
            1,
            "Mysteries of Supreme Achievement",
            "https://picsum.photos/200",
            time = "15 minutes",
        )

        val itemModel2 = SleepPopularResponse(
            2,
            "Rediscover Your Brilliance",
            "https://picsum.photos/200",
            time = "22 minutes",
        )


        val itemModel3 = SleepPopularResponse(
            3,
            "Unveiling the Secrets of Dazzling Achievement",
            "https://picsum.photos/200",
            time = "14 minutes",
        )

        val itemModel4 = SleepPopularResponse(
            4,
            "A Sleepwalker's Revelation",
            "https://picsum.photos/200",
            time = "17 minutes"
        )

        val itemModel5 = SleepPopularResponse(
            5,
            "Unraveling the Secrets of Dazzling Success",
            "https://picsum.photos/200",
            time = "37 minutes"
        )

        val itemModel6 = SleepPopularResponse(
            6,
            "A Guide to Dazzling Success",
            "https://picsum.photos/200",
            time = "27 minutes"
        )


        val itemList: ArrayList<SleepPopularResponse> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        return itemList
    }

}