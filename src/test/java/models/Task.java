package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private String nameTask;
    private String descriptionTask;
}
