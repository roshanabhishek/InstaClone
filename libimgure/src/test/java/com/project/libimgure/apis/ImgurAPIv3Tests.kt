package com.project.libimgure.apis

import com.project.libimgure.ImgurClient
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class ImgurAPIv3Tests {

    @Test
    fun sampleTest() {
        assertEquals(true, true)
    }

    @Test
    fun `GET gallery top works`() = runBlocking {
        val client = ImgurClient()
        val response = client.api.getGallery("top").status
        assertEquals(200, response)
    }

    @Test
    fun `GET gallery hot works`() = runBlocking {
        val client = ImgurClient()
        val response = client.api.getGallery("hot").status
        assertEquals(200, response)
    }

    @Test
    fun `GET tags works`() = runBlocking {
        val client = ImgurClient()
        val response = client.api.getTags().status
        assertEquals(200, response)
    }
}