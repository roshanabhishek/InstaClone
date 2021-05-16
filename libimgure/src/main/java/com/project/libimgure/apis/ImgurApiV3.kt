package com.project.libimgure.apis

import com.project.libimgure.models.GalleryResponse
import com.project.libimgure.models.TagsResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ImgurApiV3 {
    @GET("gallery/{section}")
    suspend fun getGallery(
        @Path("section") section: String
    ): GalleryResponse

    @GET("tags")
    suspend fun getTags(): TagsResponse

}