package fantastic.octo.umbrella;

import java.util.Arrays;
import java.util.UUID;

public class UmbrellaRepository {
    public Umbrella[] create(Umbrella[] umbrellas) {
        return Arrays.stream(umbrellas)
                .map(u ->
                        Umbrella.builder()
                                .uuid(UUID.randomUUID())
                                .color(u.getColor())
                                .material(u.getMaterial())
                                .size(u.getSize())
                                .build())
                .toArray(Umbrella[]::new);
    }
}
