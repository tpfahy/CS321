package com.group16;

import java.util.Set;
import java.util.function.Predicate;

public class FileDatabase implements Database {
    @SuppressWarnings("unused")
    private String filename;
    public FileDatabase(String filename) {
        this.filename = filename;
    }
    @Override
    public void connect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void disconnect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(int objId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void insert(WorkflowObject obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<WorkflowObject> select(Predicate<WorkflowObject> filter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(WorkflowObject obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
