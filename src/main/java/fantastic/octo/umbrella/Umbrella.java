package fantastic.octo.umbrella;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@EqualsAndHashCode
@Builder
@Getter
public class Umbrella {
    private final UUID uuid;
    private final String color;
    private final String size;
    private final String material;
}
