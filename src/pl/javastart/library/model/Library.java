package pl.javastart.library.model;

public class Library {

    private static final int MAX_PUBLICATION = 2000;
    private int publicationNumber=0;
    private Publication[] publications = new Publication[MAX_PUBLICATION];


    public void addBook(Book book) {
        if (publicationNumber< MAX_PUBLICATION) {
            publications[publicationNumber] = book;
            publicationNumber ++;
        } else {
            System.out.println("Maxymalna liczba książek została osiągnięta");
        }
    }

    public void printBooks() {
        int countBooks =0;
        for (int i = 0; i < publicationNumber; i++) {
            if (publications[i] instanceof Book) {
                System.out.println(publications[i]);
                countBooks++;
            }
        }
        if (countBooks == 0) {
            System.out.println("Brak książek w bibliotece");
        }
    }

    public void addMagazine(Magazine magazine) {
        if (publicationNumber< MAX_PUBLICATION) {
            publications[publicationNumber] = magazine;
            publicationNumber ++;
        } else {
            System.out.println("Maxymalna liczba magazynów została osiągnięta");
        }
    }

    public void printMagazines() {
        int countMagazines = 0;
        for (int i = 0; i < publicationNumber; i++) {
            if (publications[i] instanceof Magazine) {
                System.out.println(publications[i]);
                countMagazines++;
            }
        }
        if (countMagazines == 0) {
            System.out.println("Brak magazynów w bibliotece");
        }
    }
}