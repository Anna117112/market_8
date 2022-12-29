package com.geekbrains.spring.web.stat.repositories;



import com.geekbrains.spring.web.stat.entities.TopProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// создание запросов
// если запросы круд операций пропсываать не надо они сами создаются
// можно по названию если понятное
// через @Query
@Repository
// указываем с какой сущьностью будем работаь и какого типа первичный ключ<Product, Long>
// для работы со спецификацией JpaSpecificationExecutor
public interface TopProductOrderRepository extends JpaRepository<TopProductOrder, Long> {
//    @Query("select p from Product p where p.title = ?1")
//    Optional<Product> findByName(String title);
}
// @Query("select s from Student s where s.score between ?1 and ?2")
// поиск по названию метода прописываем этоо медот в сервисе и контр
//    List<Product> findAllByCostBetween(Integer min, Integer max);
//
