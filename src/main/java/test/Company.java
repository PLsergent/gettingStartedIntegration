package test;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Company {
    private int id;
    public String name;
    public List<Integer> playersIds;
    public List<Integer> gamesIds;
}
