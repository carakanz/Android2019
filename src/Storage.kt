open class Storage : IStorage {

    private val map: MutableMap<String, Any?> by lazy { mutableMapOf<String, Any?>() }

    internal fun putIntoMap(key: String, value: Any?) {
        map[key] = value
    }

    override fun put(key: String, value: String): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Int): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Long): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Char): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Double): Unit = putIntoMap(key, value)

    override fun get(key: String): Any? = map[key]

}