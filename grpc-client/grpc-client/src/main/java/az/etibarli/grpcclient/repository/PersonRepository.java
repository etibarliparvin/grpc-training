package az.etibarli.grpcclient.repository;

import lombok.RequiredArgsConstructor;
import nu.studer.sample.tables.records.PersonRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static nu.studer.sample.Tables.PERSON;

@Repository
@RequiredArgsConstructor
public class PersonRepository {

    private final DSLContext context;

    public PersonRecord findById(Long id) {
        return context.select()
                .from(PERSON)
                .where(PERSON.ID.eq(id))
                .fetchOneInto(PersonRecord.class);
    }
}
