package com.example.demo.model;

import com.example.demo.model.audit.DateAudit;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "school")
public class School extends DateAudit {

    String address;

    @OrderColumn()
    int capacity;

}
