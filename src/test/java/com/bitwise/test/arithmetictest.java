package com.bitwise.test;

import com.bitwise.main.Numbers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by akankshag on 1/28/2016.
 */
public class arithmetictest {

  @Test(expected=InvalidNumberException.class)
    public void itShouldInsertValidNumber(){
        //given
        Numbers number = new Numbers(12);

        //when
      number.itShouldEnterValidNumber(new Number(10));

        //then
    }

    public void itShouldaddtheNumbers(){
        //given
        Add add = new Add();

        //when

        //then
    }
}
