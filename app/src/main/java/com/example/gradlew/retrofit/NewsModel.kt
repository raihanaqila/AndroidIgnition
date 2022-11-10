package com.example.gradlew.retrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gradlew.retrofit.network.NewsApi
import kotlinx.coroutines.launch

class NewsModel: ViewModel() {
    fun getTopHeadlines() {
        viewModelScope.launch {
            val response = NewsApi.retrofitService.getTopHeadline()
            Log.d("response", response)
        }
    }

}