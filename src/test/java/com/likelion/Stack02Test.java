package com.likelion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    Stack02 st = new Stack02();

    @BeforeEach
    void setup(){
        st.push(10);
        st.push(20);
    }
    @Test
    @DisplayName("push가 잘 되는지")
    void push(){

        Integer[] arr = st.getArr();
        //10, 20
        assertEquals(10,arr[0]);
        assertEquals(20,arr[1]);
    }

    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndPop(){

        Assertions.assertEquals(20, st.pop());
        Assertions.assertEquals(10, st.pop());

//        st.push(30);
//        Assertions.assertEquals(30, st.pop());
    }

    @Test
    @DisplayName("peek 테스트")
    void peekTest(){;
        Assertions.assertEquals(20,st.peek());
        Assertions.assertEquals(20,st.peek());
    }

}