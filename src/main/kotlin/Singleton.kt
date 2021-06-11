object Singleton {
    private var _instance: Singleton? = null
    var field: Int = 0

    @get:Synchronized
    val instance: Singleton?
        get() {
            if (_instance == null) _instance = Singleton
            return _instance
        }
}