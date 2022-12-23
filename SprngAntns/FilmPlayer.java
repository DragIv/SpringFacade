package SprngAntns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FilmPlayer {

    @Autowired // устанавливаем значение поля
    @Qualifier("comedyFilm") // позволяет уточнить имя бина, который надо внедрить
    private Film comedyFilm;

    @Autowired
    @Qualifier("horrorFilm")
    private Film horrorFilm;

    @Autowired
    @Qualifier("westernFilm")
    private Film westernFilm;

    public String playFilm() {
        return "playing: " + comedyFilm.getFilm() + ", " + horrorFilm.getFilm() + ", " + westernFilm.getFilm();
    }
}
