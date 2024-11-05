package br.com.linstoque.estoque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.linstoque.estoque.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
