package ru.javersingleton.play_life.screen.project.bdui_test


sealed interface Object {

}

interface Structure: Object {

    operator fun get(vararg path: String): Object

    fun update(path: List<String>, value: Object): Structure

}

data class ComplexStructure(
    private val fields: Map<String, Object>
) : Structure {
    override operator fun get(vararg path: String): Object {
        var last: Object = this
        for (element in path) {
            val lastStructure = last as Structure
            last = lastStructure[element]
        }

        return last
    }

    override fun update(path: List<String>, value: Object): Structure {
        val resultFields = fields.toMutableMap()
        val pathHead = path.first()
        val pathTail = path.drop(1)
        val changedObject = resultFields[pathHead]
        resultFields[pathHead] = if (changedObject is Structure) {
            changedObject.update(pathTail, value)
        } else {
            value
        }
        return ComplexStructure(resultFields)
    }



    companion object {
        fun pathOf(path: String): List<String> = path.split(".")
    }
}

data class Property(
    val value: String
): Object