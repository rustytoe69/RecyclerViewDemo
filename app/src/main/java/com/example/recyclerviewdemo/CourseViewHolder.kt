package com.example.recyclerviewdemo

import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.databinding.ListItemLayoutBinding


class CourseViewHolder(val binding: ListItemLayoutBinding):
RecyclerView.ViewHolder(binding.root){
    private lateinit var currentCourse: Course

    init{
        binding.root.setOnClickListener{view->
            Toast.makeText(
                view.context, currentCourse.courseTitle +" clicked!", Toast.LENGTH_SHORT
            ).show()
        }
    }



    fun bindCourse(course:Course){
        currentCourse=course
        binding.textViewCourseTitle.text=currentCourse.courseTitle
        binding.textViewCourseInstructor.text=currentCourse.courseInstructor
        binding.imageViewCourseImage.setImageResource(currentCourse.courseImageResourceId)
    }
}