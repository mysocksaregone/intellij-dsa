import Meeting
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MeetingSchedulerTest {
    //straightforward tests
    @Test
    fun `returns false when there are no meetings`() {
        val meetings = emptyList<Meeting>()

        assertFalse(SchedulerStraightforward(meetings))
    }

    @Test
    fun `returns false for one meeting`() {
        val meetings = listOf(
            Meeting(1, 3)
        )

        assertFalse(SchedulerStraightforward(meetings))
    }
    @Test
    fun `returns true when meetings overlap`() {
        val meetings = listOf(
            Meeting(1, 5),
            Meeting(3, 7)
        )

        assertTrue(SchedulerStraightforward(meetings))
    }
    @Test
    fun `returns false when meetings only touch`() {
        val meetings = listOf(
            Meeting(1, 3),
            Meeting(3, 5)
        )

        assertFalse(SchedulerStraightforward(meetings))
    }

    // sorted scheduler
    @Test
    fun `sorted version returns false for no meetings`() {
        val meetings = emptyList<Meeting>()

        assertFalse(SchedulerSorted(meetings))
    }

    @Test
    fun `sorted version returns false for one meeting`() {
        val meetings = listOf(
            Meeting(1, 3)
        )

        assertFalse(SchedulerSorted(meetings))
    }

    @Test
    fun `sorted version detects overlapping meetings`() {
        val meetings = listOf(
            Meeting(1, 5),
            Meeting(3, 7)
        )

        assertTrue(SchedulerSorted(meetings))
    }

    @Test
    fun `sorted version allows meetings that touch`() {
        val meetings = listOf(
            Meeting(1, 3),
            Meeting(3, 5)
        )

        assertFalse(SchedulerSorted(meetings))
    }

}