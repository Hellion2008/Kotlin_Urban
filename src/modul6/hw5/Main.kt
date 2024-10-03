package modul6.hw5

fun main() {

    val catalog = CatalogUsers()
    catalog.greeting()
    catalog.createList();
    catalog.createList();
    catalog.createList();
    for (i in catalog.list.indices){
        if (catalog.list[i] != null)
            println("$i: ${catalog.list[i]}")
    }

}