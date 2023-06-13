data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Sizes,
    val width: Int,
    val height: Int
)

data class Sizes(
    val type: String,// (string) — тип копии. См. Формат описания размеров фотографии.
    val url: String,// (string) — URL копии.
    val width: Int,// (integer) — высота в px.
    val height: Int// (integer) — ширина в px.
)

data class PhotoAttachment(val photo: Photo) : Attachment {
    override val type = "photo"
}

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Image,
    val firstFrame: FirstFrame,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Boolean,
    val accessKey: String,
    val processing: Boolean,
    val isFavorite: Boolean,
    val canComment: Boolean,
    val canEdit: Boolean,
    val canLike: Boolean,
    val canRepost: Boolean,
    val canSubscribe: Boolean,
    val canAddToFaves: Boolean,
    val canAttachLink: Boolean,
    val width: Int,
    val height: Int,
    val user_id: Int,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val repeat: Int,
    val type: String,
    val balance: Int,
    val liveStatus: String,
    val live: Boolean,
    val upcoming: Boolean,
    val spectators: Int,
    val likes: Likes,
    val reposts: Repost
)

data class FirstFrame(
    val height: Int,
    val url: String,
    val width: String
)

data class Image(
    val height: Int,
    val url: String,
    val width: Int,
    val withPadding: Int?
)

data class VideoAttachment(val video: Video) : Attachment {
    override val type = "Video"
}

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
    val isHq: Boolean
)

data class AudioAttachment(val audio: Audio) : Attachment {
    override val type = "Audio"
}

data class Sticker(
    val productId: Int,
    val stickerId: Int,
    val images: Image,
    val animationUrl: String,
    val isAllowed: Boolean
)

data class StickerAttachment(val sticker: Sticker) : Attachment {
    override val type = "Sticker"
}

data class Url(
    val url: String,
    val title: String,
    val caption: String,
    val description: String,
    val photo: Photo,
    val product: Product,
    val button: Button,
    val previewPage: String,
    val previewUrl: String
)

data class Button(val title: String, val action: Action)

data class Action(val type: String, val url: String)

data class Product(val price: Int)

data class UrlAttachment(val url: Url) : Attachment {
    override val type = "Url"
}