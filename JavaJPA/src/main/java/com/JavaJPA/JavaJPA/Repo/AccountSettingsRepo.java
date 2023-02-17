package com.JavaJPA.JavaJPA.Repo;

import com.JavaJPA.JavaJPA.entity.AccountSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountSettingsRepo extends JpaRepository<AccountSettings, Integer> {
}
