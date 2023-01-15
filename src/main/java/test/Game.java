package test;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Game {
    private int id;
    public String name;
    public int companyId;
    public List<Integer> playersIds;
}
