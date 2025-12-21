package com.adina.eduapp.dto.request;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@AllArgsConstructor
@NoArgsConstructor
public class CourseCreateDto {
    @NotNull
    private String name;
}
