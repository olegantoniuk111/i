/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.igov.model.subject;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.igov.model.core.AbstractEntity;

/**
 *
 * @author olga
 */
public class SubjectGroupTree extends AbstractEntity{
    
    @JsonProperty(value = "oSubjectGroup_Child")
    @ManyToOne(targetEntity = SubjectGroup.class)
    @JoinColumn(name="nID_SubjectGroup_Child", nullable = false, updatable = false)
    private SubjectGroup oSubjectGroup_Child;
    
    @JsonProperty(value = "oSubjectGroup_Parent")
    @ManyToOne(targetEntity = SubjectGroup.class)
    @JoinColumn(name="nID_SubjectGroup_Parent", nullable = false, updatable = false)
    private SubjectGroup oSubjectGroup_Parent;

    public SubjectGroup getoSubjectGroup_Child() {
        return oSubjectGroup_Child;
    }

    public void setoSubjectGroup_Child(SubjectGroup oSubjectGroup_Child) {
        this.oSubjectGroup_Child = oSubjectGroup_Child;
    }

    public SubjectGroup getoSubjectGroup_Parent() {
        return oSubjectGroup_Parent;
    }

    public void setoSubjectGroup_Parent(SubjectGroup oSubjectGroup_Parent) {
        this.oSubjectGroup_Parent = oSubjectGroup_Parent;
    }
    
}
