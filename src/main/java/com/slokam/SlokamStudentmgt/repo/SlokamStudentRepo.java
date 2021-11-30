package com.slokam.SlokamStudentmgt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.SlokamStudentmgt.entity.SlokamStudent;


@Repository
public interface SlokamStudentRepo extends JpaRepository<SlokamStudent, Long> {
@Query("select s from SlokamStudent s join s.Passport p where p.passportno=?1")
//@Query( "select s from Student s join s.passport p where p.passporNo=?1")

public SlokamStudent grtSStudentBypptNo(String pptNo);

}
