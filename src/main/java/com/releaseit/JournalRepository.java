package com.releaseit;

import org.springframework.data.jpa.repository.JpaRepository;



public interface JournalRepository extends JpaRepository<JournalEntry, Long> 
{

}
