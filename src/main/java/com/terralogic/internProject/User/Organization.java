package com.terralogic.internProject.User;


public class Organization {

    Organization terraLogic ;

    public Organization(Organization terraLogic) {
        this.terraLogic = terraLogic;
    }

    public Organization getTerraLogic() {

        return terraLogic;
    }

    public void setTerraLogic(Organization terraLogic) {
        this.terraLogic = terraLogic;
    }
}
