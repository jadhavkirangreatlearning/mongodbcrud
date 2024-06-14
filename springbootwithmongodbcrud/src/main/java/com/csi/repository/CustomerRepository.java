package com.csi.repository;

import com.csi.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {

    // Custom methods
    Customer findByCustEmailIdAndCustPassword(String custEmailId, String custPassword);

    // findby customer name[SWARA | SWARAJ | swar]
}
