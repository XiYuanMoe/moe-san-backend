package online.xyworld.moe.moesanbackend.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "moe_challenge_registration")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MoeChallengeRegistration {
    @Id
    @Column
    public UUID challengeId;
    @Column
    public UUID characterId;
    @Column
    public Date registrationTime;
}
