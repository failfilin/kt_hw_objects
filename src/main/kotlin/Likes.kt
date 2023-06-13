class Likes(
    val count: Int?,// число пользователей, которым понравилась запись;
    val user_likes: Int?,// — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
    val can_like: Int?,// — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
    val can_publish: Int?// — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).
)
