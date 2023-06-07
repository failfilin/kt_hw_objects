import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addCangeId() {
        val testPostToAdd = Post()
        val postAfterAdd = WallService.add(testPostToAdd)
        assertNotEquals(0,postAfterAdd.id)
    }
    @Test
    fun updateTrueCheck(){
        val testPostToAdd = Post()
        val postAfterAdd = WallService.add(testPostToAdd)
        val statusAfterUpgraid = WallService.update(postAfterAdd)
        assertEquals(true, statusAfterUpgraid)
    }
    @Test
    fun updateFalseCheck(){
        val testPostToAdd = Post()
        val postAfterAdd = WallService.add(testPostToAdd)
        val statusAfterUpgraid = WallService.update(testPostToAdd)
        assertEquals(false, statusAfterUpgraid)
    }
}