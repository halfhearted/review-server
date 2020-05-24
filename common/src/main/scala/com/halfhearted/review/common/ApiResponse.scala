package com.halfhearted.review.common


case class ApiResponseMeta(statusCode:Int, error:Option[ErrorMessage] = None)
