package com.adina.eduapp.dto.request;

import com.adina.eduapp.entity.EnrollmentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusChangeEnrollmentDto {
    @NotNull
    private Long enrollmentId;

    @NotNull
    private EnrollmentStatus enrollmentStatus;
}
