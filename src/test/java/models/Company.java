package models;

import com.google.gson.annotations.SerializedName;
import enums.TypeOfCompany;

public class Company {
    private String name;
    private TypeOfCompany typeOfCompany;
    private String INN;
    private String OGRN;
    private String KPP;
    private int phone;
    private String address;
    private User user;

}
