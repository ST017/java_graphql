package com.example.demo.entities;


//import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@ToString

@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "roots")

public class Root{

    public Root(Flist flist) {
        this.flist = flist;
    }

//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name = "id", nullable = false)
//    private Long id;
//
//    @OneToOne(cascade = CascadeType.ALL)
    public Flist flist;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

}