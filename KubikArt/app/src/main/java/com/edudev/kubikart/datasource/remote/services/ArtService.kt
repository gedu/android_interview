package com.edudev.kubikart.datasource.remote.services

import com.edudev.kubikart.datasource.remote.model.ArtSerial
import retrofit2.Response
import retrofit2.http.GET

interface ArtService {

    @GET("artworks?limit=5")
    suspend fun getArt(): Response<ArtSerial>
}