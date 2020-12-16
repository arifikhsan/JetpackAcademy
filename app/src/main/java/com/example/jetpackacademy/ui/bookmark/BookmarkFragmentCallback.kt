package com.example.jetpackacademy.ui.bookmark

import com.example.jetpackacademy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
