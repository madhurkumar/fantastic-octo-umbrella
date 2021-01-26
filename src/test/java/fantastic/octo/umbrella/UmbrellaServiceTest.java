package fantastic.octo.umbrella;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.mockito.Mockito.*;


public class UmbrellaServiceTest {

    @Test
    public void createUmbrellas_should_return_umbrella_ids() {
        final Umbrella[] umbrellas = new Umbrella[]{
                Umbrella.builder()
                        .uuid(UUID.randomUUID())
                        .color("Red")
                        .material("Plastic")
                        .size("M")
                        .build()
        };
        UmbrellaRepository umbrellaRepository = mock(UmbrellaRepository.class);
        UmbrellaService umbrellaService = new UmbrellaService(umbrellaRepository);
        when(umbrellaRepository.create(any(Umbrella[].class))).thenReturn(umbrellas);
        String[] uIds = umbrellaService.createUmbrellas(umbrellas);
        assertThat(uIds, arrayWithSize(1));
    }
}
