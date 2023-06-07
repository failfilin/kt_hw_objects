object WallService {
    private var posts = emptyArray<Post>()

    fun add(postToAdd: Post): Post {
        val postWithId = postToAdd.copy(id = posts.size + 1)
        posts += postWithId
        return posts.last()
    }

    fun update(postToUpdate: Post): Boolean {
        for ((id, post) in posts.withIndex()) {
            if (post.id == postToUpdate.id) {
                posts[id] = postToUpdate
                return true
            }
        }
        return false
    }
}
