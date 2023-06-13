data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int?,
    val friendsOnly: Boolean = false,
    val comments: Comment? ,
    val postType: String = "post",
    val signerId: Int?,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false
)