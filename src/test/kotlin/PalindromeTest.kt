import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class PalindromeTest {

    @Test
    fun `1221 should return 1331`() {
        val input = mutableListOf(1, 2, 2, 1)

        val result = nextPalindromeDigits(input)

        assertEquals(listOf(1, 3, 3, 1), result)
    }

    @Test
    fun `33 should return 44`() {
        val input = mutableListOf(3, 3)

        val result = nextPalindromeDigits(input)

        assertEquals(listOf(4, 4), result)
    }

    @Test
    fun `999 should return 1001`() {
        val input = mutableListOf(9, 9, 9)

        val result = nextPalindromeDigits(input)

        assertEquals(listOf(1, 0, 0, 1), result)
    }

    @Test
    fun `99 should return 101`() {
        val input = mutableListOf(9, 9)

        val result = nextPalindromeDigits(input)

        assertEquals(listOf(1, 0, 1), result)
    }
}