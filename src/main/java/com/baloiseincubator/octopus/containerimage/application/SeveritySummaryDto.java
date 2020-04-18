package com.baloiseincubator.octopus.containerimage.application;

import com.baloiseincubator.octopus.containerimage.domain.Severity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeveritySummaryDto {

    private Severity severity;
    private int count;
    private int fixable;
}
