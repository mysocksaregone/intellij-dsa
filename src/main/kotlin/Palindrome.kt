
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// This is the old code translated into Kotlin
    fun nextPalindromeDigits(digits:MutableList<Int>):List<Int>{

        //find the middle 2 digits. same digit if list is odd length
        var highMid: Int = (digits.count()).floorDiv(2)
        var lowMid: Int = (digits.count()-1).floorDiv(2)

        //while the middle value is still less than the length of the palindrome
        while ((highMid < digits.count()) && (lowMid >= 0)){
            // 9 cannot increase to 10 so it's 0 and the one is carried over
            if (digits[highMid] == 9){
                digits[highMid] = 0
                digits[lowMid] = 0
                // moving the positions outward on both ends
                highMid += 1
                lowMid += 1
            } else {
                // normally increase the middle digit
                digits[highMid] += 1

                // if they're not the same digit, increase the other as well
                if (lowMid != highMid){
                    digits[lowMid] += 1
                }

                //palindrome complete
                return digits
            }
        }
        // the case in which all digits were 9 so the new palindrome
        // is enclosed by 1 and has 0s on the inside.
        return listOf(1) + List(digits.count()-1) {0} + listOf(1)
    }