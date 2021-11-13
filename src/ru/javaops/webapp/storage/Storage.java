package ru.javaops.webapp.storage;

import ru.javaops.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public interface Storage {

     void clear();

     void update(Resume resume);

     void save(Resume resume);

     Resume get(String uuid);

     void delete(String uuid);

     Resume[] getAll();

     int size();

}
