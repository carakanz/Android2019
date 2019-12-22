@ExperimentalUnsignedTypes
@Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")
class ArrayList<T> {
    private var bufferSize = 8
    @Suppress("UNCHECKED_CAST")
    private var buffer: Array<T?> = Array<Any?>(8) { null } as Array<T?>;
    private var size = 0

    fun add(value: T) {
        if (size == bufferSize) {
            reserve(bufferSize * 2);
        }
        buffer[size] = value;
        ++size;
    }

    fun insert(value: T, index: Int) {
        checkIndex(index)

        if (bufferSize == size) {
            reserve(bufferSize * 2);
        }

        ++size

        for (i in size + 1 downTo index) {
            buffer[i + 1] = buffer[i]
        }

        buffer[index] = value
    }

    fun delete(index: Int) : T {
        checkIndex(index)
        val value = get(index);
        for (i in index until size - 2) {
            buffer[i] = buffer[i + 1]
        }
        --size;
        if (bufferSize > 8 && size < bufferSize / 4) {
            reserve(size);
        }
        return value;
    }

    fun get(index: Int): T {
        checkIndex(index)
        @Suppress("UNCHECKED_CAST")
        return buffer[index] as T
    }

    private fun checkIndex(index: Int) {
        if (index < 0 || index > size) {
            throw IndexOutOfBoundsException()
        }
    }

    private fun reserve(size: Int) {
        bufferSize = size
        buffer = buffer.copyOf(size)
    }
}

fun main(args: Array<String>) {
    
}