package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
//17.2.3
@Repository
@Transactional
public interface JobRepository extends CrudRepository<Job, Integer> {
}

//12.3.3




