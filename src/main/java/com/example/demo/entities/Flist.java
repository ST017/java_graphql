package com.example.demo.entities;

//import jakarta.persistence.*;
import lombok.*;

//@Entity
//@Table
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Flist {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
//    private Long id;

    //    @JsonProperty("BRAND_OBJ")
//@Column( name = "flist")
    public String BRAND_OBJ;
    //    @JsonProperty("CURRENCY_SECONDARY")
    public int CURRENCY_SECONDARY;
    //    @JsonProperty("ACCOUNT_TYPE")
    public int ACCOUNT_TYPE;
    //    @JsonProperty("NEXT_ITEM_POID_LIST")
    public String NEXT_ITEM_POID_LIST;
    //    @JsonProperty("WRITE_ACCESS")
    public String WRITE_ACCESS;
    //    @JsonProperty("READ_ACCESS")
    public String READ_ACCESS;
    //    @JsonProperty("INCORPORATED_FLAG")
    public int INCORPORATED_FLAG;
    //    @JsonProperty("ACCOUNT_TAG")
    public String ACCOUNT_TAG;
    //    @JsonProperty("TIMEZONE_ID")
    public String TIMEZONE_ID;
    //    @JsonProperty("VAT_CERT")
    public String VAT_CERT;
    //    @JsonProperty("STATUS")
    public int STATUS;
    //    @JsonProperty("INTERNAL_NOTES")
//    @OneToOne(cascade = CascadeType.ALL)

    public INTERNAL_NOTES INTERNAL_NOTES;
    //    @JsonProperty("MOD_T")
    public int MOD_T;
    //    @JsonProperty("BUSINESS_TYPE")
    public int BUSINESS_TYPE;
    //    @JsonProperty("GL_SEGMENT")
    public String GL_SEGMENT;
    //    @JsonProperty("STATUS_FLAGS")
    public int STATUS_FLAGS;
    //    @JsonProperty("BAL_GRP_OBJ")
    public String BAL_GRP_OBJ;
    //    @JsonProperty("LASTSTAT_CMNT")
    public String LASTSTAT_CMNT;
    //    @JsonProperty("NAMEINFO")
 //   @OneToOne(cascade = CascadeType.ALL)
    public NAMEINFO NAMEINFO;
    //    @JsonProperty("AAC_ACCESS")
    public String AAC_ACCESS;
    //    @JsonProperty("CREATED_T")
    public int CREATED_T;
    //    @JsonProperty("CURRENCY")
    public int CURRENCY;
    //    @JsonProperty("ITEM_POID_LIST")
    public String ITEM_POID_LIST;
    //    @JsonProperty("OBJECT_CACHE_TYPE")
    public int OBJECT_CACHE_TYPE;
    //    @JsonProperty("ATTRIBUTE")
    public int ATTRIBUTE;
    //    @JsonProperty("AAC_PACKAGE")
    public String AAC_PACKAGE;
    //    @JsonProperty("AAC_PROMO_CODE")
    public String AAC_PROMO_CODE;
    //    @JsonProperty("NAME")
    public String NAME;
    //    @JsonProperty("AAC_SOURCE")
    public String AAC_SOURCE;
    //    @JsonProperty("GROUP_OBJ")
    public String GROUP_OBJ;
    //    @JsonProperty("ACCESS_CODE1")
    public String ACCESS_CODE1;
    //    @JsonProperty("AAC_VENDOR")
    public String AAC_VENDOR;
    //    @JsonProperty("ACCESS_CODE2")
    public String ACCESS_CODE2;
    //    @JsonProperty("LOCALE")
    public String LOCALE;
    //    @JsonProperty("RESIDENCE_FLAG")
    public int RESIDENCE_FLAG;
    //    @JsonProperty("LAST_STATUS_T")
    public int LAST_STATUS_T;
    //    @JsonProperty("AAC_SERIAL_NUM")
    public String AAC_SERIAL_NUM;
    //    @JsonProperty("EFFECTIVE_T")
    public int EFFECTIVE_T;
    //    @JsonProperty("ACCOUNT_NO")
    public String ACCOUNT_NO;
    //    @JsonProperty("CLOSE_WHEN_T")
    public int CLOSE_WHEN_T;
    //    @JsonProperty("CUSTOMER_SEGMENT_LIST")
    public String CUSTOMER_SEGMENT_LIST;
    //    @JsonProperty("LINEAGE")
    public String LINEAGE;
    //    @JsonProperty("POID")
    public String POID;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
