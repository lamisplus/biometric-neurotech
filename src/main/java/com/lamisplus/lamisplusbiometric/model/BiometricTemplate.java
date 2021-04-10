package com.lamisplus.lamisplusbiometric.model;

import lombok.Data;

@Data
public class BiometricTemplate {
    private String id;
    private Boolean iso;
    private byte[] template;
}
