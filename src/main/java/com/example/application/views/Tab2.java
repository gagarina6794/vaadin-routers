package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RoutePrefix;
import com.vaadin.flow.router.RouterLayout;

@Route(value = "tab2")
@RoutePrefix("tab2")
@ParentLayout(MainLayout.class)
public class Tab2 extends HorizontalLayout implements RouterLayout {

    public Tab2() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);

        SideBar2 sideBar = new SideBar2();
        this.add(sideBar);
    }
}
