package com.likelion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {


    @BeforeEach
    void setup(){
    }
    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        Integer[] arr = st.getArr();
        //10, 20
        assertEquals(10,arr[0]);
        assertEquals(20,arr[1]);
    }

    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndPop(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

        assertThrows(EmptyStackException.class, ()->
                st.pop());

    }

    @Test
    @DisplayName("peek 테스트")
    void peekTest(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20,st.peek());
        assertEquals(20,st.peek());


    }

    @Test
    @DisplayName("isEmpty 테스트")
    void isEmpty(){
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();

    }

    @Test
    void realStack(){
        Stack<Integer> st = new Stack<>();
        assertThrows(EmptyStackException.class, ()->
                st.pop());

    }


}