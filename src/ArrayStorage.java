import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        for (int index = 0; index < size; index++) {
                storage[index] = null;
        }
        size = 0;
    }

    void save(Resume r) {
        storage[size] = r;
        size++;
    }

    Resume get(String uuid) {

        for (int index = 0; index < size; index++) {
            if (storage[index].toString().equals(uuid))
                return storage[index];
        }
        return null;
    }

    void delete(String uuid) {

        for (int index = 0; index < size; index++) {
            if (storage[index] == null || storage[index].toString().equals(uuid)) {
                storage[index] = storage[index + 1];
                storage[index + 1] = null;
            }
        }
            size--;
        }

    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }
}
