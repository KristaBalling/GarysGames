package com.theironyard.Units;

    public class UnitTester {


        public void testType(Unit unit, String type, String expectedOutputType) {
            System.out.println("\nTesting setting/getting the type property.");
            unit.setType(type);
            String outputType = unit.getType();
            if (expectedOutputType.equals(outputType)) {
                System.out.println("Test passed");
            } else {
                System.out.println("Test failed: " + outputType + " didn't match " +
                        expectedOutputType);
            }
        }

        public void testUnitSpecificProperty(Unit unit, String propertyName,
                                             Object inputValue, Object expectedOutputValue) {
            System.out.println("Testing setting/getting a unit-specific property.");
            unit.setProperty(propertyName, inputValue);
            Object outputValue = unit.getProperty(propertyName);
            if (expectedOutputValue.equals(outputValue)) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test failed: " + outputValue + " didn't match " +
                        expectedOutputValue);
            }
        }

        public void testChangeProperty(Unit unit, String propertyName,
                                       Object inputValue, Object expectedOutputValue) {
            System.out.println("\nTesting changing an existing property's value.");
            unit.setProperty(propertyName, inputValue);
            Object outputValue = unit.getProperty(propertyName);
            if (expectedOutputValue.equals(outputValue)) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test failed: " + outputValue + " didn't match " +
                        expectedOutputValue);
            }
        }

        public void test4(Unit unit, String propertyName) {
            System.out.println(
                    "\nTesting getting a non-existent property's value.");
            try {
                Object outputValue = unit.getProperty(propertyName);
            } catch (RuntimeException e) {
                System.out.println("Test passed.");
                return;
            }
            System.out.println("Test failed.");
        }
    }
