package com.golfhomes.society.model; import jakarta.persistence.*; import lombok.*; import java.time.LocalDateTime;
@Entity @Getter @Setter @NoArgsConstructor public class Poll { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id; String title,eligibilityRule="ONE_VOTE_PER_FLAT",status="PLANNED"; @Column(length=3000) String description; LocalDateTime startAt,endAt; }
