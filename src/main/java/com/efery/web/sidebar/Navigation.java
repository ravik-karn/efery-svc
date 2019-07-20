package com.efery.web.sidebar;

import java.util.List;

public class Navigation {
    private long id;
    private long originalId;
    private String name;
    private List<Navigation> children;
    private String type;

    public Navigation(long id, long originalId, String name, List<Navigation> children, String type) {
        this.id = id;
        this.originalId = originalId;
        this.name = name;
        this.children = children;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOriginalId() {
        return originalId;
    }

    public void setOriginalId(long originalId) {
        this.originalId = originalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Navigation> getChildren() {
        return children;
    }

    public void setChildren(List<Navigation> children) {
        this.children = children;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
