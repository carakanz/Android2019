import kotlin.reflect.KProperty

class StorageDelegate<T>(private var key: String, value: T) : Storage() {
    init {
        putIntoMap(key, value)
    }

    @Suppress("UNCHECKED_CAST")
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = get(key) as T

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) = putIntoMap(key, value)
}