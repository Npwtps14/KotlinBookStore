package com.example.senddata

class DataModel {
    var title: String?=null
    var desc: String?=null
    var photos: String?=null
    var files: String?=null
    var key:String?=null
    var photo:String?=null



    fun toMap(): Map<String, Any> {
        val result = HashMap<String, Any>()
        result.put("title", title!!)
        result.put("desc", desc!!)
        result.put("thumbnail", photos!!)
        result.put("key", key!!)
        result.put("files", files!!)
        result.put("photo", photo!!)
        return result


    }
}

