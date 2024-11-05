package org.example.jenkins.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class CalculatorDTO {
    @NonNull
    private Integer num1;
    @NonNull
    private Integer num2;
    private Integer sum;
}
