package com.example.Movieapp.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.Movieapp.pagingClasses.CharcterPagingSource

class Repository {
    fun getPageList()= Pager(config = PagingConfig(pageSize = 20),
        pagingSourceFactory = { CharcterPagingSource() }).liveData
}