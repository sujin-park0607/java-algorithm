package com.likelion.programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _12909Test {

    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket(){
        _12909 solution = new _12909();

        boolean result1 = solution.solution("()()");
        assertTrue(result1);

        boolean result2 = solution.solution("(())()");
        assertTrue( result2);

        boolean result3 = solution.solution(")()(");
        assertFalse( result3);

        boolean result4 = solution.solution("(()(");
        assertFalse( result4);

        boolean result5 = solution.solution("{}()[](({))");
        assertFalse( result5);

        boolean result6 = solution.solution("{}()[](({}))");
        assertTrue( result6);
    }

}