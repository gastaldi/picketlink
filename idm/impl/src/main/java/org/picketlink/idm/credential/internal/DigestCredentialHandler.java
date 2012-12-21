package org.picketlink.idm.credential.internal;

import org.picketlink.idm.credential.Credentials;
import org.picketlink.idm.credential.Digest;
import org.picketlink.idm.credential.DigestCredentials;
import org.picketlink.idm.credential.spi.annotations.SupportsCredentials;
import org.picketlink.idm.credential.spi.annotations.SupportsStores;
import org.picketlink.idm.file.internal.FileBasedIdentityStore;
import org.picketlink.idm.jpa.internal.JPAIdentityStore;
import org.picketlink.idm.ldap.internal.LDAPIdentityStore;
import org.picketlink.idm.model.Agent;
import org.picketlink.idm.spi.IdentityStore;

/**
 * This particular implementation supports the validation of UsernamePasswordCredentials, and updating PlainTextPassword credentials.
 *
 * @author Shane Bryzak
 * @author <a href="mailto:psilva@redhat.com">Pedro Silva</a>
 */
@SupportsCredentials({DigestCredentials.class, Digest.class})
@SupportsStores({JPAIdentityStore.class, FileBasedIdentityStore.class, LDAPIdentityStore.class})
public class DigestCredentialHandler extends PlainTextPasswordCredentialHandler {
    
    @Override
    public void validate(Credentials credentials, IdentityStore<?> identityStore) {
    }
    
    @Override
    public void update(Agent agent, Object credential, IdentityStore<?> store) {
        
    }
}
