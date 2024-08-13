package online.xyworld.moe.moesanbackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "moe_challenge_config")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MoeChallengeStage {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    @Builder.Default
    public UUID stageId = UUID.randomUUID();
    @Column
    public UUID challengeId;
    @Column
    public String stageName;
    @Column
    public String stageTitle;
    @Column
    public String description;

    //TODO Convert
    @Column
    public StageType stageType;

    //这个字段用来设置额外信息, 比如BATTLE的时候到底是多少人, 应为json格式
    @Column
    public String stageExtra;
    @Column
    public Date startTime = new Date();

    public enum StageType{
        AUDITION, BATTLE
    }
}
