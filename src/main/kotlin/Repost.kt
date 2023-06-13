class Repost(
    val count: Int = 0,// — число пользователей, скопировавших запись;
    val user_reposted: Boolean? =null // — наличие репоста от текущего пользователя (1 — есть, 0 — нет).
)