package com.capgemini.day4.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day4.Employee;
import com.capgemini.day4.President;
import com.capgemini.day4.SalesManager;

	class EmployeeTest {

			Employee employee;
			SalesManager salesmanager;
			President president;

			@BeforeEach
			void setUp() {
				employee = new Employee(1234, "Shiny", 50000, 1000);
				salesmanager = new SalesManager(1234, "Keerthana", 50000, 1000);
				president = new President(1234, "George", 50000, 1000);
				president.setKilometresTravelled(2000);
			}

			@Test
			void testEmployee() {
				assertEquals(4000,salesmanager.getCalculatePetrolAllowance(),1);
			}

			@Test
			void testSalesManagerAllowance() {
				assertEquals(4000,salesmanager.getCalculatePetrolAllowance(),1);
				assertEquals(6500,salesmanager.getCalculateFoodAllowance(),1);
				assertEquals(1500,salesmanager.getCalculateOtherAllowance(),1);		
			}
			
			@Test
			void testPresidentAllowance() {
				assertEquals(16000,president.getTourAllowance(),1);
				assertEquals(2000,president.getTelephoneAllowance(),1);	
			}
			@AfterEach
			void tearDown() {
				employee = null;
			}

		}

