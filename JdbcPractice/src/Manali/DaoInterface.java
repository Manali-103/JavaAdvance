package Manali;

import java.util.Collection;

public interface DaoInterface <T,K> {
      Collection<Restaurant> getAll();
      T getOne( K key );
      void create(T t);
      void deleteOne(K key);
      void update(T t);
}
