package online.xyworld.moe.moesanbackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "moe_challenges")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoeChallenge {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    @Builder.Default
    public UUID id = UUID.randomUUID();
    @Column
    public String name;
    @Column
    public String title;
    @Column
    public String description;

    @Column
    @Builder.Default
    public Date startTime = new Date();

    @Column
    @Builder.Default
    public Date endTime = new Date();

    @Column
    @Builder.Default
    public boolean active = true;
}


