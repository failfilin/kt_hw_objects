data class Post(
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int? = null,
    val createdBy: Int?= null,
    val date: Int?= null,
    val text: String?= null,
    val replyOwnerId: Int?= null,
    val replyPostId: Int?= null,
    val copyright : CopyRight?= null,
    val likes : Likes?= null,
    val reposts : Repost?= null,
    val views : Views?= null,
    val friendsOnly: Boolean = false,
    val comments: Comment?= null ,
    val postType: String = "post",
    val geo: Geo?= null,
    val signerId: Int?= null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean?= null,
    val isFavorite: Boolean?= null,
    val postponedId: Int?= null,
    val attachment: Array<Attachment> = emptyArray()
)