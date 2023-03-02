package com.techacademy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Country")
public class Country {
    @Id  //主キーである事を示す
    private String code; // <= 主キー
    private String name;
    private int population;
}
