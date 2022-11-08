package com.crio.qeats.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectUtils {
     public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
