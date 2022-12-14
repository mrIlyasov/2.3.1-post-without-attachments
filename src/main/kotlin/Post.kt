data class Post(
    val id: Int,
    val from_Id: Int,
    val owner_Id: Int,
    var text: String,
    var likes: Likes,
    var views: Views,
    var reposts: Reposts,
    var friendsOnly: Boolean,
    var markedAsAds: Boolean,
    ) {


    init {

    }



    override fun toString(): String {
        return ("$id, $from_Id, $owner_Id, $text, $likes, $views, $reposts, $friendsOnly, $markedAsAds")
    }


}