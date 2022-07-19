package com.edudev.kubikart.home

import androidx.lifecycle.ViewModel
import com.edudev.kubikart.ArtItem

class HomeController: ViewModel() {

    companion object {
        var artResult = mutableListOf<ArtItem>()
    }

    fun fetchArt() {
        // Fetch the art using the HomeRepository

        // To the result list switch places, from 0 to 3
        // then store it into `artResult`
    }

    private fun MutableList<ArtItem>.switchPlaces(from: Int, to: Int) {
        this.add(to, this.removeAt(from))
    }
}
