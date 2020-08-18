package ru.fabit.error


data class AppInternalError
@JvmOverloads constructor(
    val detailMessage: String
) : Exception(detailMessage)
