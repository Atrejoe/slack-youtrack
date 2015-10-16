package com.ontometrics.integrations.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

public class IssueField {
    @XmlAttribute
    private String name;

    @JacksonXmlProperty(localName = "value")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<IssueFieldValue> values = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IssueFieldValue> getValues() {
        return values;
    }

    public void setValues(List<IssueFieldValue> values) {
        this.values = values;
    }
}
