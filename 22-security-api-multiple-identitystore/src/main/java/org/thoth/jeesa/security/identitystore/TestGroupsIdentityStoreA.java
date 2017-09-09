package org.thoth.jeesa.security.identitystore;

import static java.util.Arrays.asList;
import java.util.HashSet;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStore;
import static javax.security.enterprise.identitystore.IdentityStore.ValidationType.PROVIDE_GROUPS;
import org.apache.log4j.Logger;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
@ApplicationScoped
public class TestGroupsIdentityStoreA implements IdentityStore {

    private static final Logger log = Logger.getLogger(TestGroupsIdentityStoreA.class);

    @Override
    public Set<String> getCallerGroups(CredentialValidationResult validationResult) {
        log.info("ENTER #getCallerGroups()");
        return new HashSet<>(asList("GROUP_CUSTOMER_SUPPORTS"));
    }

    @Override
    public Set<ValidationType> validationTypes() {
        return new HashSet<>(asList(PROVIDE_GROUPS));
    }
}