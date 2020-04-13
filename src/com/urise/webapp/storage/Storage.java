package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.Arrays;

public interface Storage {

        public void clear();

        public int size();

        public void update(Resume r);

        public void save(Resume r);

        public Resume get(String uuid);

        public void delete(String uuid);

        public Resume[] getAll() ;

}
