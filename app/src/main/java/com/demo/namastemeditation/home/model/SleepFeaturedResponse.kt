package com.demo.namastemeditation.home.model

data class SleepFeaturedResponse(
    var id: Int,
    var title: String,
    var image: String,
    var time: String,
)

object SleepFeaturedResponseList {

    fun getModel(): List<SleepFeaturedResponse> {

        val itemModel1 = SleepFeaturedResponse(
            1,
            "Burn The Ships",
            "https://picsum.photos/200",
            time = "15 minutes",
        )

        val itemModel2 = SleepFeaturedResponse(
            2,
            "The Power of Notes",
            "https://picsum.photos/200",
            time = "22 minutes",
        )


        val itemModel3 = SleepFeaturedResponse(
            3,
            "The Inferno of Serenity",
            "https://picsum.photos/200",
            time = "14 minutes",
        )

        val itemModel4 = SleepFeaturedResponse(
            4,
            "From Silicon to Ash",
            "https://picsum.photos/200",
            time = "17 minutes"
        )


        val itemList: ArrayList<SleepFeaturedResponse> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        return itemList
    }

}