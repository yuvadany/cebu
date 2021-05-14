package bibles.englishbible.cebuanobible;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 7/04/2018.
 */
public class BooksChapters {

    public static int  getChaptersCount(int book)
    {
        HashMap<Integer,Integer> booksChapters = new HashMap<Integer,Integer>();
        booksChapters.put(	1 , 50	);
        booksChapters.put(	2 , 40	);
        booksChapters.put(	3 , 27	);
        booksChapters.put(	4 , 36	);
        booksChapters.put(	5 , 34	);
        booksChapters.put(	6 , 24	);
        booksChapters.put(	7 , 21	);
        booksChapters.put(	8 , 4	);
        booksChapters.put(	9 , 31	);
        booksChapters.put(	10 , 24	);
        booksChapters.put(	11 , 22	);
        booksChapters.put(	12 , 25	);
        booksChapters.put(	13 , 29	);
        booksChapters.put(	14 , 36	);
        booksChapters.put(	15 , 10	);
        booksChapters.put(	16 , 13	);
        booksChapters.put(	17 , 10	);
        booksChapters.put(	18 , 42	);
        booksChapters.put(	19 , 150);
        booksChapters.put(	20 , 31	);
        booksChapters.put(	21 , 12	);
        booksChapters.put(	22 , 8	);
        booksChapters.put(	23 , 66	);
        booksChapters.put(	24 , 52	);
        booksChapters.put(	25 , 5	);
        booksChapters.put(	26 , 48	);
        booksChapters.put(	27 , 12	);
        booksChapters.put(	28 , 14	);
        booksChapters.put(	29 , 3	);
        booksChapters.put(	30 , 9	);
        booksChapters.put(	31 , 1	);
        booksChapters.put(	32 , 4	);
        booksChapters.put(	33 , 7	);
        booksChapters.put(	34 , 3	);
        booksChapters.put(	35 , 3	);
        booksChapters.put(	36 , 3	);
        booksChapters.put(	37 , 2	);
        booksChapters.put(	38 , 14	);
        booksChapters.put(	39 , 4	);
        booksChapters.put(	40 , 28	);
        booksChapters.put(	41 , 16	);
        booksChapters.put(	42 , 24	);
        booksChapters.put(	43 , 21	);
        booksChapters.put(	44 , 28	);
        booksChapters.put(	45 , 16	);
        booksChapters.put(	46 , 16	);
        booksChapters.put(	47 , 13	);
        booksChapters.put(	48 , 6	);
        booksChapters.put(	49 , 6	);
        booksChapters.put(	50 , 4	);
        booksChapters.put(	51 , 4	);
        booksChapters.put(	52 , 5	);
        booksChapters.put(	53 , 3	);
        booksChapters.put(	54 , 6	);
        booksChapters.put(	55 , 4	);
        booksChapters.put(	56 , 3	);
        booksChapters.put(	57 , 1	);
        booksChapters.put(	58 , 13	);
        booksChapters.put(	59 , 5	);
        booksChapters.put(	60 , 5	);
        booksChapters.put(	61 , 3	);
        booksChapters.put(	62 , 5	);
        booksChapters.put(	63 , 1	);
        booksChapters.put(	64 , 1	);
        booksChapters.put(	65 , 1	);
        booksChapters.put(	66 , 22	);
        return booksChapters.get(book);
    }

    public static String getBookName(int booknumber)
    {
        Map<Integer,String> bookName = new HashMap<Integer,String>();
        bookName.put(1 ,"Genesis-Genesis" );
        bookName.put(2 ,"Exodo-Exodus" );
        bookName.put(3 ,"Levitico-Leviticus");
        bookName.put(4 ,"Numeros-Numbers");
        bookName.put(5 ,"Deuteronomio-Deuteronomy" );
        bookName.put(6 ,"Josue-Joshua");
        bookName.put(7 ,"Mga Maghuhukom-Judges" );
        bookName.put(8 ,"Ruth-Ruth");
        bookName.put(9 ,"1 Samuel-1 Samuel");
        bookName.put(10 ,"2 Samuel-2 Samuel");
        bookName.put(11 ,"1 Mga Hari-1 Kings");
        bookName.put(12 ,"2 Mga Hari-2 Kings");
        bookName.put(13 ,"1 Cronicas-1 Chronicles" );
        bookName.put(14 ,"2 Cronicas-2 Chronicles");
        bookName.put(15 ,"Esdras-Ezra");
        bookName.put(16 ,"Nehemias-Nehemiah");
        bookName.put(17 ,"Ester-Esther");
        bookName.put(18 ,"Job-Job");
        bookName.put(19 ,"Mga Salmo-Psalms" );
        bookName.put(20 ,"Mga Panultihon-Proverbes" );
        bookName.put(21 ,"Ecclesiastes-Ecclesiastes");
        bookName.put(22 ,"Awit sa mga Awit-Song of Songs");
        bookName.put(23 ,"Isaias-Isaiah");
        bookName.put(24 ,"Jeremias-Jeremiah" );
        bookName.put(25 ,"Lamentaciones-Lamentations" );
        bookName.put(26 ,"Ezequiel-Ezekiel");
        bookName.put(27 ,"Daniel-Daniel" );
        bookName.put(28 ,"Oseas-Hosea" );
        bookName.put(29 ,"Joel-Joel");
        bookName.put(30 ,"Amos-Amos");
        bookName.put(31 ,"Abdias-Obadiah");
        bookName.put(32 ,"Jonas-Jonah");
        bookName.put(33 ,"Miqueas-Micah" );
        bookName.put(34 ,"Nahum-Nahum");
        bookName.put(35 ,"Habacuc-Habakkuk" );
        bookName.put(36 ,"Sofonias-Zephaniah" );
        bookName.put(37 ,"Haggeo-Haggai");
        bookName.put(38 ,"Zacarias-Zechariah");
        bookName.put(39 ,"Malaquias-Malachi");
        bookName.put(40 ,"Mateo-Matthew");
        bookName.put(41 ,"Marcos-Mark");
        bookName.put(42 ,"Lucas-Luke" );
        bookName.put(43 ,"Juan-John");
        bookName.put(44 ,"Mga Buhat-Acts" );
        bookName.put(45 ,"Roma-Romans");
        bookName.put(46 ,"1 Corinto-1 Corinthians");
        bookName.put(47 ,"2 Corinto-2 Corinthians" );
        bookName.put(48 ,"Galacia-Galatians" );
        bookName.put(49 ,"Efeso-Ephesians");
        bookName.put(50 ,"Filipos-Philippians");
        bookName.put(51 ,"Colosas-Colossians" );
        bookName.put(52 ,"1 Tesalonica-1 Thessalonians");
        bookName.put(53 ,"2 Tesalonica-2 Thessalonians");
        bookName.put(54 ,"1 Timoteo-1 Timothy" );
        bookName.put(55 ,"2 Timoteo-2 Timothy");
        bookName.put(56 ,"Tito-Titus" );
        bookName.put(57 ,"Filemon-Philemon" );
        bookName.put(58 ,"Hebreo-Hebrews");
        bookName.put(59 ,"Santiago-James" );
        bookName.put(60 ,"1 Pedro-1 Peter");
        bookName.put(61 ,"2 Pedro-2 Peter");
        bookName.put(62 ,"1 Juan-1 John");
        bookName.put(63 ,"2 Juan-2 John");
        bookName.put(64 ,"3 Juan-3 John");;
        bookName.put(65 ,"Judas-Jude");
        bookName.put(66 ,"Gipadayag-Revelation");
        return bookName.get(booknumber);

    }

}
