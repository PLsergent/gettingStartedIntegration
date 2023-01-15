package test;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Player {
    private int id;
    public String name;
    public String gamerTag;
    public List<Integer> gamesIds;
}
