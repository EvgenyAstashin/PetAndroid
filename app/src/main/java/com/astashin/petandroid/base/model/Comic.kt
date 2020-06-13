package com.astashin.petandroid.base.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Comic(
   @SerializedName("id")
   val id: Int,
   @SerializedName("title")
   val title: String,
   @SerializedName("description")
   val description: String,
   @SerializedName("thumbnail")
   val thumbnail: Thumbnail
) : Serializable