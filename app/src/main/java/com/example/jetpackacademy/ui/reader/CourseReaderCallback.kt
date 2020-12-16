package com.example.jetpackacademy.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}