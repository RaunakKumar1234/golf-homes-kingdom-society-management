package com.golfhomes.society.model; import jakarta.persistence.*; import lombok.*; import java.time.LocalDateTime;
@Entity @Getter @Setter @NoArgsConstructor public class Notice { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id; String title,publishedBy; @Column(length=5000) String message; LocalDateTime publishedAt=LocalDateTime.now(); }
