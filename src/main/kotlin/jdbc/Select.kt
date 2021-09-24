package jdbc

import java.sql.DriverManager

fun main() {
    val DB_URL = "jdbc:mysql://localhost/study-jdbc"
    val USER = "root"
    val PASSWORD = "root"
    val QUERY = "select * from member";

    val connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery(QUERY)
    while (resultSet.next()) {
        println(resultSet.getInt("id"))
        println(resultSet.getString("name"))
    }

}