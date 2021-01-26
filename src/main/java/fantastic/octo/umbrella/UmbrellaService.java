package fantastic.octo.umbrella;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.UUID;

@RequiredArgsConstructor
public class UmbrellaService {
    private final UmbrellaRepository umbrellaRepository;

    public String[] createUmbrellas(Umbrella[] umbrellas) {
        return Arrays.stream(umbrellaRepository.create(umbrellas))
                .map(Umbrella::getUuid)
                .map(UUID::toString)
                .toArray(String[]::new);
    }

}
