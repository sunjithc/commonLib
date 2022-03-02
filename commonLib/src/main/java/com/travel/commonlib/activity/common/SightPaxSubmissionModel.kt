package com.travel.commonlib.activity.common

import java.io.Serializable

class SightPaxSubmissionModel : Serializable {
    var activityReference: String? = null
    var workingID: String? = null
    var modeCode: String? = null
    var searchId: String? = null
    var device: String? = null
    var title: String? = null
    var firstName: String? = null
    var lastName: String? = null
    var email: String? = null
    var mobileCode: String? = null
    var mobileNumber: String? = null
    var citizenship: String? = null
    var paxType = 0
    var age: String? = null
}