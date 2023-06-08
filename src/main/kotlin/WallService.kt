object WallService {
    private var posts = emptyArray<Post>()
    private var nextId = 1
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
    }
}
