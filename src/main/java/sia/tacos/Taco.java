package sia.tacos;

import lombok.Data;
import sia.tacos.Ingredient;

import java.util.List;

@Data
public class Taco {
    private String name;
    private List<Ingredient> ingredients;
}
