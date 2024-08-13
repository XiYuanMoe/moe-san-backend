package online.xyworld.moe.moesanbackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "moe_challenge_history")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MoeChallengeHistory {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    @Builder.Default
    public UUID historyId = UUID.randomUUID();
    @Column
    public UUID characterId;
    @Column
    public UUID inStage;
    @Column
    public Long scores;
    @Column
    public UUID vsCharacter;
}
