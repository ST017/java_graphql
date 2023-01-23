package com.example.demo.entities;

//import jakarta.persistence.*;
import lombok.*;


//@Entity
//@Table(name="internalnotes")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor


@Data
public class INTERNAL_NOTES {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

//    @Column(name= "Offset",nullable = false)
    public int offset;

//    @Column(name = "Size",nullable = false)
    public int size;


    public String flags;

}
