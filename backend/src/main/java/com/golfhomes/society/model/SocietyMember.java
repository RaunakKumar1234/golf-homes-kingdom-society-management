package com.golfhomes.society.model; import jakarta.persistence.*; import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @Table(name="society_members",uniqueConstraints=@UniqueConstraint(columnNames={"loginId"})) public class SocietyMember { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id; String name,role,loginId,passwordHash; boolean active=true; }
