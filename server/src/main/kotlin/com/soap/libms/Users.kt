package com.soap.libms

import org.jetbrains.exposed.sql.Table

object Users : Table() {
    val username = varchar("username", 50)
    val password = varchar("password", 64)
    override val primaryKey = PrimaryKey(username)
}