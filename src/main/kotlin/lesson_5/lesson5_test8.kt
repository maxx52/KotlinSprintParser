package ru.maxx52

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    println("Парсер сайтов")
    println("________________________")

    // Создаем подключение к удаленной странице:
    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()

    // Вывод названия страницы
    println(doc.title())

    // Цитаты на странице помещены в div блоки с классом dBlcJs
    val quotesBook: Elements = doc.select(".dBlcJs")

    // Циклом перебираем полученный массив данных:
    for (quote: Element in quotesBook) {
        println(quote.attr("div"))
    }
}