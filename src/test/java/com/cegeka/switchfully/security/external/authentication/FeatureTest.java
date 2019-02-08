package com.cegeka.switchfully.security.external.authentication;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.Test;

import static com.cegeka.switchfully.security.external.authentication.Feature.DEPLOYMENT_INFO;
import static org.junit.Assert.*;

public class FeatureTest {

    @Test
    public void hasOneOfRoles_givenDeploymentInfo_andRolePrivate_ThenTrue() {
        Assertions.assertThat(DEPLOYMENT_INFO.hasOneOfRoles(Lists.newArrayList("PRIVATE"))).isTrue();
        Assertions.assertThat(DEPLOYMENT_INFO.hasOneOfRoles(Lists.newArrayList("PRIVATE", "OTHER"))).isTrue();
    }
}