data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comment = Comment() ,
    val postType: String = "post",
    val signer_id: Int = 0,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false
)