package com.urise.webapp.storage;

import com.urise.webapp.exeption.NotExistStorageException;
import com.urise.webapp.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractArrayStorageTest {
    private Storage storage = new ArrayStorage();
    private static final String UUID_1= "uuid1";
    private static final String UUID_2= "uuid1";
    private static final String UUID_3= "uuid1";

    @Before
    public void setUp() throws Exception{
        storage.clear();
        storage.save(new Resume(UUID_1));
        storage.save(new Resume(UUID_2));
        storage.save(new Resume(UUID_3));
    }

    @Test
    public void size() {
        Assert.assertEquals(3,storage.size());
    }

    @Test
    public void clear() {
        storage.clear();
        assertEquals(0,storage.size());
    }

    @Test
    public void update() {

    }

    @Test
    public void getAll() {


    }

    @Test
    public void save() {
    }

    @Test
    public void insertElement() {
    }

    @Test
    public void delete() {
    }

    @Test(expected = NotExistStorageException.class)
    public void getNotExist() {
        storage.get("dummy");
    }
}