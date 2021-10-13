package com.example.Movieapp.ui

import com.example.Movieapp.dataFromJson.ResponseDTO

sealed class MainUIModel {
    data class onSuccess(val responseDTO: ResponseDTO):MainUIModel()
    data class onFailure(val error:String):MainUIModel()

}