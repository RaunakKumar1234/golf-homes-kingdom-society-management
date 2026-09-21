package com.golfhomes.society.model; import jakarta.persistence.*; import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @Table(name="owners",uniqueConstraints=@UniqueConstraint(columnNames={"loginId"})) public class Owner { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id; String flatNumber,name,email,phone,loginId,passwordHash; boolean active=true,votingEligible=true; }
