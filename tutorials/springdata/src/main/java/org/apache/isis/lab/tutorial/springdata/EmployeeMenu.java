package org.apache.isis.lab.tutorial.springdata;

import javax.inject.Inject;

import org.apache.isis.applib.annotation.Action;
import org.apache.isis.applib.annotation.ActionLayout;
import org.apache.isis.applib.annotation.DomainObjectLayout;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.NatureOfService;
import org.apache.isis.applib.services.factory.FactoryService;

import lombok.RequiredArgsConstructor;

@DomainService(nature=NatureOfService.VIEW, logicalTypeName = "isisLab.EmployeeMenu")
@DomainObjectLayout(named="Employees")
@RequiredArgsConstructor(onConstructor_ = { @Inject })
public class EmployeeMenu {

    final FactoryService factoryService;

    @Action
    @ActionLayout(cssClassFa="fa-bolt")
    public EmployeeManager employeeManager(){
        return factoryService.viewModel(EmployeeManager.class);
    }
    

}
