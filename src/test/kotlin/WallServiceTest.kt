import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addCangeId() {
        val testPostToAdd = Post()
        val postAfterAdd = WallService.add(testPostToAdd)
        assertNotEquals(0, postAfterAdd.id)
    }

    @Test
    fun updateTrueCheck() {
        val testPostToAdd = Post()
        val postAfterAdd = WallService.add(testPostToAdd)
        val statusAfterUpgraid = WallService.update(postAfterAdd)
        assertEquals(true, statusAfterUpgraid)
    }

    @Test
    fun updateFalseCheck() {
        val testPostToAdd = Post()
        val postAfterAdd = WallService.add(testPostToAdd)
        val statusAfterUpgraid = WallService.update(testPostToAdd)
        assertEquals(false, statusAfterUpgraid)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val testComment = Comment()
        val CreateCommentTest = WallService.createComment(postId = 1,testComment)
    }

    @Test
    fun shouldAddComment(){
        val testComment = Comment(id=1, text = "Happy to add")
        val testPostToAdd = Post(id=1)
        WallService.add(testPostToAdd)
        val addComment = WallService.createComment(1,testComment)
        assertEquals(testComment,addComment)
    }
}