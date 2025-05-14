import java.util.ArrayList;

class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }

    // Operacje na utworach
    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }

    public void usunUtwor(String utwor) {
        if (utwory.contains(utwor)) {
            utwory.remove(utwor);
            for (Playlista p : playlisty) {
                p.usunUtwor(utwor);
            }
        }
    }

    public void wyswietlUtwory() {
        System.out.println("Utwory w bibliotece:");
        for (String utwor : utwory) {
            System.out.println("- " + utwor);
        }
    }

    public void wyszukajUtwory(String fraza) {
        System.out.println("Wyszukiwanie utworów zawierających frazę: \"" + fraza + "\"");
        for (String utwor : utwory) {
            if (utwor.toLowerCase().contains(fraza.toLowerCase())) {
                System.out.println("- " + utwor);
            }
        }
    }

    // Operacje na playlistach
    public void utworzPlayliste(String nazwa) {
        for (Playlista p : playlisty) {
            if (p.getNazwa().equalsIgnoreCase(nazwa)) {
                System.out.println("Playlista o tej nazwie już istnieje.");
                return;
            }
        }
        playlisty.add(new Playlista(nazwa));
    }

    private Playlista znajdzPlayliste(String nazwa) {
        for (Playlista p : playlisty) {
            if (p.getNazwa().equalsIgnoreCase(nazwa)) {
                return p;
            }
        }
        return null;
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if (p != null) {
            if (utwory.contains(utwor)) {
                p.dodajUtwor(utwor);
            } else {
                System.out.println("Utwór nie istnieje w bibliotece.");
            }
        } else {
            System.out.println("Nie znaleziono playlisty o nazwie: " + nazwaPlaylisty);
        }
    }

    public void wyswietlPlayliste(String nazwaPlaylisty) {
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if (p != null) {
            p.wyswietl();
        } else {
            System.out.println("Playlista nie znaleziona.");
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Lista wszystkich playlist:");
        for (Playlista p : playlisty) {
            System.out.println("- " + p.getNazwa());
        }
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
