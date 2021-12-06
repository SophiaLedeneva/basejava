package ru.javaops.webapp.storage;

import org.junit.Assert;
import org.junit.Test;
import ru.javaops.webapp.exception.StorageException;
import ru.javaops.webapp.model.Resume;

/**
 * SLedeneva
 * 21.11.2021
 */
public abstract class AbstractStorageArrayTest extends AbstractStorageTest{

    protected AbstractStorageArrayTest(Storage storage) {
        super(storage);
    }

    @Test(expected = StorageException.class)
    public void saveOverflow() {
        try {
            for (int i = 4; i <= AbstractArrayStorage.STORAGE_LIMIT; i++) {
                storage.save(new Resume("Name" + i));
            }
        } catch (StorageException e) {
            Assert.fail();
            e.printStackTrace();
        }
        storage.save(new Resume("Overflow"));
    }

}