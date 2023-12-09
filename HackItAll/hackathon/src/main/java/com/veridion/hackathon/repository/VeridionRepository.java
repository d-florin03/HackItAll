package com.veridion.hackathon.repository;

import com.veridion.hackathon.entity.Veridion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//TODO Folositi in service metodele din repository pe partea de CRUD, cautati pe net Repository Pattern

@Repository
public class VeridionRepository implements CrudRepository<Veridion, Long> {

    @Override
    public <S extends Veridion> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Veridion> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Veridion> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Veridion> findAll() {
        return null;
    }

    @Override
    public Iterable<Veridion> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Veridion entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Veridion> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
