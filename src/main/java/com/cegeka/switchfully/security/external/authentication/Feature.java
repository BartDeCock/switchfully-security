package com.cegeka.switchfully.security.external.authentication;

import java.util.Arrays;
import java.util.List;

public enum Feature {
    DEPLOYMENT_INFO("GENERAL", "PRIVATE"),
    JOIN_ARMY("CIVILIAN"),
    PROMOTE_PRIVATE("HUMAN_RELATIONSHIPS"),
    DISCHARGE_SOLDIER("HUMAN_RELATIONSHIPS"),
    LAUNCH_NUKE("GENERAL");


    private String[] roles;

    Feature(String... roles) {
        this.roles = roles;
    }

    public boolean hasOneOfRoles(List<String> roles) {
        return roles.stream()
                .filter(role -> Arrays.asList(this.roles).contains(role))
                .findFirst()
                .isPresent();
    }
}
