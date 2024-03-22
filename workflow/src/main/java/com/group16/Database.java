package com.group16;

import java.io.Serializable;
import java.util.Set;
import java.util.function.Predicate;

public interface Database {
    public void connect();
    public void disconnect();
    public void insert(WorkflowObject obj);
    public void update(WorkflowObject obj);
    public void delete(int objId);
    public Set<WorkflowObject> select(Predicate<WorkflowObject> filter);
}
