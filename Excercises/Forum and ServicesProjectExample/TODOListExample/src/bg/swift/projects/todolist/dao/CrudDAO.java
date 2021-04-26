package bg.swift.projects.todolist.dao;

/**
 * TODO:
 * READ WHAT IS DAO:
 * http://www.oracle.com/technetwork/java/dataaccessobject-138824.html
 */
public interface CrudDAO<T> {

    int insertNew(T t);
    int update(T t);
    boolean delete(T t);
    T getById(Integer id);
}
