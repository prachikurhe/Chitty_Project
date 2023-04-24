package com.digital.fund.chitty.service;

import com.digital.fund.chitty.mapper.IMapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class GenericService<D,T, ID, R extends JpaRepository<T, ID>, M extends IMapper<D, T>> {

    protected R repository;
    protected M mapper;
    protected GenericService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public Optional<D> finById(ID id){
        Optional<T> byId = repository.findById(id);
        return byId.map(mapper::convertEntityToDto);
    }

    public D save(D dto){
        T entity = mapper.convertDtoToEntity(dto);
        T savedEntity = this.repository.save(entity);
        return this.mapper.convertEntityToDto(savedEntity);
    }

    public D update(D dto){
        T entity = mapper.convertDtoToEntity(dto);
        T savedEntity = this.repository.save(entity);
        return this.mapper.convertEntityToDto(savedEntity);
    }

    public void delete(ID id){
        Optional<T> byId = repository.findById(id);
        byId.ifPresent(repository::delete);
    }

}
