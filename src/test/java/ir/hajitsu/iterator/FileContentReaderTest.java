package ir.hajitsu.iterator;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class FileContentReaderTest {

    @Test
    void iterator() throws FileNotFoundException {
        FileContentReader fileContentReader = new FileContentReader("/Users/hajitsu/Desktop/Passwords.csv");
        Iterator<String> iterator = fileContentReader.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}