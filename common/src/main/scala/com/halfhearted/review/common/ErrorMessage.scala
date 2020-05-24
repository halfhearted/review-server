package com.halfhearted.review.common


case class ErrorMessage(code:String, shortText:Option[String] = None, /*params:Option[Map[String,String]] = None*/)