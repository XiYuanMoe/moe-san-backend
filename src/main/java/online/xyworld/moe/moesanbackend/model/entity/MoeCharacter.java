package online.xyworld.moe.moesanbackend.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "moe_characters")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoeCharacter {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.UUID)
    @Builder.Default
    public UUID id = UUID.randomUUID();

    @Column
    public String displayName;
    @Column
    public String description;
    @Column
    public String avatarUrl;
    @Column
    public String characterUrl;
}
