package evotingsystem

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SystemServiceSpec extends Specification {

    SystemService systemService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new System(...).save(flush: true, failOnError: true)
        //new System(...).save(flush: true, failOnError: true)
        //System system = new System(...).save(flush: true, failOnError: true)
        //new System(...).save(flush: true, failOnError: true)
        //new System(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //system.id
    }

    void "test get"() {
        setupData()

        expect:
        systemService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<System> systemList = systemService.list(max: 2, offset: 2)

        then:
        systemList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        systemService.count() == 5
    }

    void "test delete"() {
        Long systemId = setupData()

        expect:
        systemService.count() == 5

        when:
        systemService.delete(systemId)
        sessionFactory.currentSession.flush()

        then:
        systemService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        System system = new System()
        systemService.save(system)

        then:
        system.id != null
    }
}
