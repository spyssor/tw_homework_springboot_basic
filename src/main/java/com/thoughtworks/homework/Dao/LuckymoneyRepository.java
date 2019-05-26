package com.thoughtworks.homework.Dao;

import com.thoughtworks.homework.Entity.Luckymoney;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LuckymoneyRepository extends JpaRepository<Luckymoney, Integer> {
}
