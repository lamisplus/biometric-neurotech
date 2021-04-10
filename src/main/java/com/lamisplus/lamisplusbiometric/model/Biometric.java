package com.lamisplus.lamisplusbiometric.model;

import lombok.Data;

import java.util.List;

@Data
public class Biometric {
    List<byte[]> templates;
}
