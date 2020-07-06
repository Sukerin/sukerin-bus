package org.sukerin.authapi;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dr
 */
@ConfigurationProperties("usm.auth")
public class UsmAuthProperties {
    private static final String DEFAULT_NAME = "sukerin-auth";

    private String name=DEFAULT_NAME;
    private String url="";
    private String path="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
