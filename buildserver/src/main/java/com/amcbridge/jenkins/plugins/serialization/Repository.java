package com.amcbridge.jenkins.plugins.serialization;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@XStreamAlias("repository")
public class Repository {

    @XStreamAsAttribute
    private String type;

    @XStreamAsAttribute
    private String url;

    public void setType(String value) {
        type = value;
    }

    public String getType() {
        return type;
    }

    public void setUrl(String value) {
        url = value;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Repository) {
            return new EqualsBuilder()
                    .append(this.type, ((Repository) obj).type)
                    .append(this.url, ((Repository) obj).url)
                    .isEquals();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.type)
                .append(this.url)
                .toHashCode();
    }
}
