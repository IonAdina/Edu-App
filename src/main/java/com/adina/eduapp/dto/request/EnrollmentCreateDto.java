package com.adina.eduapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentCreateDto {
    @NotNull
    private Long courseId;
}
