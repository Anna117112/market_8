package com.geekbrains.spring.web.stat.repositories;






import com.geekbrains.spring.web.stat.entities.TopProductCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// создание запросов
// если запросы круд операций пропсываать не надо они сами создаются
// можно по названию если понятное
// через @Query
@Repository
// указываем с какой сущьностью будем работаь и какого типа первичный ключ<Product, Long>
// для работы со спецификацией JpaSpecificationExecutor
public interface TopProductCartRepository extends JpaRepository<TopProductCart, Long> {
//    @Query("select p from Product p where p.title = ?1")
//    Optional<Product> findByName(String title);
// если прописываем запросы sql то ставим value = и nativeQuery = true
    @Query(value = "select * from  TopProductCart  order by quantity desc limit 5 ", nativeQuery = true)

    List<TopProductCart> findTopCart();

    //Optional<TopProductCart> findByTitle(String title);


    @Query( "select t from TopProductCart t where t.title = ?1")
    TopProductCart findByName(String title);
  //  Query(value = "select *  from  TopProductCart  where title =  ", nativeQuery = true)
   // List<TopProductCart> findTopCart();
// поиск по названию метода прописываем этоо медот в сервисе и контр
}