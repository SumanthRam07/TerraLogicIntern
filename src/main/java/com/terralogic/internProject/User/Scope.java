package com.terralogic.internProject.User;

import java.util.HashSet;



public class Scope {

    Scope fullScope ;

    Scope  restrictedScope ;


    HashSet<Scope> scopeList ;

    public Scope(Scope fullScope, Scope restrictedScope, HashSet<Scope> scopeList) {
        this.fullScope = fullScope;
        this.restrictedScope = restrictedScope;


        this.scopeList = scopeList;

        scopeList.add(fullScope) ;
        scopeList.add(restrictedScope) ;
    }


    public Scope getFullScope() {
        return fullScope;
    }

    public void setFullScope(Scope fullScope) {
        this.fullScope = fullScope;
    }

    public Scope getRestrictedScope() {
        return restrictedScope;
    }

    public void setRestrictedScope(Scope restrictedScope) {
        this.restrictedScope = restrictedScope;
    }

    public HashSet<Scope> getScopeList() {
        return scopeList;
    }

    public void setScopeList(HashSet<Scope> scopeList) {
        this.scopeList = scopeList;
    }
}
