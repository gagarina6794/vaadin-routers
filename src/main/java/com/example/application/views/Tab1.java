package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RoutePrefix;
import com.vaadin.flow.router.RouterLayout;

@Route(value = "tab1")
@RoutePrefix("tab1")
@ParentLayout(MainLayout.class)
public class Tab1 extends HorizontalLayout implements RouterLayout {

    public Tab1() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);

        SideBar1 sideBar = new SideBar1();
        this.add(sideBar);
    }
}
