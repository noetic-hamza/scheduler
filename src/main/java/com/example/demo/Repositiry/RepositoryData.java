package com.example.demo.Repositiry;
import com.example.demo.entity.TblRetryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;

@Repository
public interface RepositoryData extends JpaRepository<TblRetryEntity,Long> {


    @Transactional
    @Modifying
    @Query(value= "update tbl_retry set ctimestamp = now() + interval '7 minutes' where ctimestamp < now() - interval '5 min'and response_code !=0 and " +
            "tbl_charging_id in (select tbl_charging_id from public.tbl_retry tr left join tbl_charging tc on tc.id=tr.tbl_charging_id " +
            "where ctimestamp between :dar and :dar2 ) and num_of_attempts <5 ;",nativeQuery = true)
     void getResult(Timestamp dar, Timestamp dar2);
}
