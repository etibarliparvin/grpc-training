package com.example.grpcserver.repository;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.AddressRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.Tables.ADDRESS;

@Repository
@RequiredArgsConstructor
public class AddressRepository {

    private final DSLContext context;

    public AddressRecord findById(Long id) {
        return context.select()
                .from(ADDRESS)
                .where(ADDRESS.PERSON_ID.eq(id))
                .fetchOneInto(AddressRecord.class);
    }
}
