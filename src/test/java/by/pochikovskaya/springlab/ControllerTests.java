package by.pochikovskaya.springlab;

import by.pochikovskaya.springlab.restcontroller.ComputerRestController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ControllerTests {
    @Autowired
    ComputerRestController controller;
    @Test
    public void testGetComputer() throws Exception {
        Assert.assertNotNull(controller.getComputerById(1L));
    }
}