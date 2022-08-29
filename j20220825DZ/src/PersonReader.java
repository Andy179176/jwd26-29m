import Exceptions.PersonReaderException;

public interface PersonReader {
    Person getPerson() throws PersonReaderException;
}
