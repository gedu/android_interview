package com.edudev.kubikart.home

import com.edudev.kubikart.ArtItem

class HomeRepository {

    suspend fun fetchArt(): List<ArtItem>? {
        // Fetch the art calling the RemoteDataSource
        return null
    }
}