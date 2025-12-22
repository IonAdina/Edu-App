package com.adina.eduapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradeChangeDto {
    @NotNull
    private Long enrollmentId;

    @NotNull
    private Integer grade;
}
