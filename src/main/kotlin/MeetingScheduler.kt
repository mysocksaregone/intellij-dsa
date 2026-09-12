#!/usr/bin/env kotlin

data class Meeting(val start: Int, val end: Int)

// checks for every pair of meeting for an overlap
fun SchedulerStraightforward(meetings: List<Meeting>) : Boolean {
    for (i in 0 until meetings.count()) {
        for (j in i + 1 until meetings.count()) {
            val meet1 = meetings[i]
            val meet2 = meetings[j]
            // returns true when conflict is found
            if (meet1.start < meet2.end && meet2.start < meet1.end) {
                return true
            }
        }
        // no conflict so false
    }
    return false
}

//sorts meetings by starting time first then compares
fun SchedulerSorted(meetings: List<Meeting>): Boolean {
    //the sorting
    val sorted = meetings.sortedBy { it.start }

    //only check adjacent meetings
    for (i in 0 until sorted.count() - 1) {
        val current = sorted[i]
        val next = sorted[i + 1]

        // one meeting ends after the next starts = conflict
        if (current.end > next.start) {
            return true
        }

    }
    // everything runs smoothly
    return false
}
