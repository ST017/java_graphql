package com.example.demo.entities;

//import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;
import lombok.*;




//@Entity
//@Table(name = "nameinfo")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Data
public class NAMEINFO {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    public int elem;
    //@JsonProperty("LAST_CANON")
    public String LAST_CANON;
    // @JsonProperty("ZIP")
    public int ZIP;
    //  @JsonProperty("MIDDLE_CANON")
    public String MIDDLE_CANON;
    // @JsonProperty("EMAIL_ADDR")
    public String EMAIL_ADDR;
    // @JsonProperty("STATE")
    public String STATE;
    //  @JsonProperty("CANON_COUNTRY")
    public String CANON_COUNTRY;
    //    @JsonProperty("LAST_NAME")
    public String LAST_NAME;
    //    @JsonProperty("FIRST_NAME")
    public String FIRST_NAME;
    //    @JsonProperty("COMPANY")
    public String COMPANY;
    //    @JsonProperty("CITY")
    public String CITY;
    //    @JsonProperty("CONTACT_TYPE")
    public String CONTACT_TYPE;
    //    @JsonProperty("COUNTRY")
    public String COUNTRY;
    //    @JsonProperty("SALUTATION")
    public String SALUTATION;
    //    @JsonProperty("ADDRESS")
    public String ADDRESS;
    //    @JsonProperty("CANON_COMPANY")
    public String CANON_COMPANY;
    //    @JsonProperty("MIDDLE_NAME")
    public String MIDDLE_NAME;
    // @JsonProperty("TITLE")
    public String TITLE;

    public String SERVICE_OBJ;
    //    @JsonProperty("FIRST_CANON")
    public String FIRST_CANON;

}
