package com.digital.fund.chitty.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "member")
@EntityListeners(AuditingEntityListener.class)
public class Member extends Auditable<String>{
    @Id
    @GeneratedValue
    private Long memberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

}
