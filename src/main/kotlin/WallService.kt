import java.lang.RuntimeException

object WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 1
    private var nextCommentId = 1
    private var comments = emptyArray<Comment>()
    fun add(postToAdd: Post): Post {
        val postWithId = postToAdd.copy(id = nextId)
        posts += postWithId
        nextId += 1
        return posts.last()
    }

    fun update(postToUpdate: Post): Boolean {
        for ((id, post) in posts.withIndex()) {
            if (post.id == postToUpdate.id) {
                posts[id] = postToUpdate.copy()
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        nextId = 1
        nextCommentId = 1
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((id, post) in posts.withIndex()) {
            if (post.id == postId) {
                val commentWithId = comment.copy(id=nextCommentId)
                nextCommentId += 1
                comments += commentWithId.copy()
                return comments.last()
            }
        }
        throw PostNotFoundException("No post with id = $postId")
    }
}

class PostNotFoundException(message: String) : RuntimeException(message)