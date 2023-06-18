data class Comment(
    val id: Int? = null,
    val fromId: Int? = null,
    val date: Int? = null,
    val text: String? = null,
    val donut: Donut? = null,
    val replyToUser: Int? = null,
    val replyToComment: Int? = null,
    val attachments: Attachment? = null,
    val parentsStack: Array<Int> = emptyArray(),
    val thread: Thread? = null
)

data class Donut(
    val sDon: Boolean,
    val placeholder: String
)

data class Thread(
    val count: Int,
    val items: String,
    val can_post: Boolean,
    val show_reply_button: Boolean,
    val groups_can_post: Boolean
)