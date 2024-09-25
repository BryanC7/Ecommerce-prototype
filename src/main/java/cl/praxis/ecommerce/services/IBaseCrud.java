package cl.praxis.ecommerce.services;

import java.util.List;

public interface IBaseCrud <T> {
    List<T> getAll();
    T getById(Long id);
    T create(T t);
    T update(T t);
    boolean delete(Long id);
}
