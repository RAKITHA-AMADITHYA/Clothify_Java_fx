package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class supplier {
    private int supplier_id;
    private String name;

    private String  company;

    private String email;

    private String title;


}
