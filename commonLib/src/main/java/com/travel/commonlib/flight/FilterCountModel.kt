package com.travel.commonlib.flight

import java.io.Serializable

/**
 * Created by Rohith (Android) on 12/13/2021.
 */
class FilterCountModel :Serializable{
    var refundable_count = 0
    var nonrefundable_count = 0
    var refund_charge_count = 0

    var dep_early_morning = 0
    var dep_morning = 0
    var dep_afternoon = 0
    var dep_late_night = 0

    var arr_early_morning = 0
    var arr_morning = 0
    var arr_afternoon = 0
    var arr_late_night = 0

    var round_dep_early_morning = 0
    var round_dep_morning = 0
    var round_dep_afternoon = 0
    var round_dep_late_night = 0

    var round_arr_early_morning = 0
    var round_arr_morning = 0
    var round_arr_afternoon = 0
    var round_arr_late_night = 0
}