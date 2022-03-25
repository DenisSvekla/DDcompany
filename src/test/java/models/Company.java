package models;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Company {
    private String name;
    private String INN;
    private String OGRN;
    private String KPP;
    private String type;
    private String email_owner;
    private String phone;
    private String address;


}
