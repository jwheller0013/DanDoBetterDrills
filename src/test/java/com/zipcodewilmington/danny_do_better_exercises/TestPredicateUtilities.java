package com.zipcodewilmington.danny_do_better_exercises;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Modified by kristofer 3/4/2024.
 */
public class TestPredicateUtilities {
    private static volatile PredicateUtilities predicateUtilities = new PredicateUtilities();

    @Test
    public void testReturnTrue(){
        // : Given
        // : When
        // : Then

        assertTrue(predicateUtilities.returnTrue());
    }

    @Test
    public void testReturnFalse(){
        // : Given
        // : When
        // : Then
        assertFalse(predicateUtilities.returnFalse());
    }

    @Test
    public void testGreaterThanTrue() {
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;


        // : When
        boolean outcome = predicateUtilities.isGreaterThan(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }


    @Test
    public void testGreaterThanFalse() {
        // : Given
        int greaterValue = 350;
        int lesserValue = 350;

        // : When
        boolean outcome = predicateUtilities.isGreaterThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }


    @Test
    public void testLessThanTrue() {
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;

        // : When
        boolean outcome = predicateUtilities.isLessThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }


    @Test
    public void testLessThanFalse() {
        // : Given
        int greaterValue = 450;
        int lesserValue = 350;

        // : When
        boolean outcome = predicateUtilities.isLessThan(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }


    @Test
    public void testLessOrEqualTrue() {
        // : Given
        int greaterValue = 3;
        int lesserValue = 3;

        // : When
        boolean outcome = predicateUtilities.isLessThanOrEqualTo(greaterValue, lesserValue);

        // : Then
        assertTrue(outcome);
    }

    @Test
    public void testLessOrEqualFalse() {
        // : Given
        int greaterValue = 6;
        int lesserValue = 3;

        // : When
        boolean outcome = predicateUtilities.isLessThanOrEqualTo(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }

    @Test
    public void testGreaterOrEqualTrue() {
        // : Given
        int greaterValue = 4;
        int lesserValue = 4;

        // : When
        boolean outcome = predicateUtilities.isGreaterThanOrEqualTo(greaterValue, lesserValue);

        // : ThenP
        assertTrue(outcome);
    }


    @Test
    public void testGreaterOrEqualFalse() {
        // : Given
        int greaterValue = 8;
        int lesserValue = 15;

        // : When
        boolean outcome = predicateUtilities.isGreaterThanOrEqualTo(greaterValue, lesserValue);

        // : Then
        assertFalse(outcome);
    }
}
