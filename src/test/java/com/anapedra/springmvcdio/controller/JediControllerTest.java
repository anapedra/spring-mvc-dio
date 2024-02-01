package com.anapedra.springmvcdio.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JediControllerTest {


    @Test
    public void  ShouldSaveJediWhenEmailDoesNotExist(){

        final var expectedName = "Ana Lúcia";
        final var expectEmail = "anapedra.mil@gmail.com";
        final var expectedCpf = "01589021576";



        final var actualJedi=
                Jedi.newJedi(expectedName,expectEmail,expectedCpf);

        Assertions.assertNotNull(actualJedi);
        Assertions.assertNotNull(actualJedi.getId());
        Assertions.assertEquals(expectedName,actualJedi.getName());
        Assertions.assertEquals(expectedCpf,actualJedi.getCpf());
        Assertions.assertNotNull(actualJedi.getCreatedAt());
        Assertions.assertNotNull(actualJedi.getUpdatedAt());
        Assertions.assertNull(actualJedi.getDaletdAt());



    }
}
