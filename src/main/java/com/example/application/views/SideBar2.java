package com.example.application.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

public class SideBar2 extends VerticalLayout {

    public SideBar2() {
        init();
    }

    private void init() {
        this.setWidth("200px");
        this.setHeightFull();
        this.getStyle().set("background", "#B0BEC5");

        RouterLink routerLink1 = new RouterLink();
        routerLink1.setRoute(ContentLayout3.class);
        routerLink1.setText("Content 3");

        Div link1 = new Div();
        link1.add(routerLink1);

        RouterLink routerLink2 = new RouterLink();
        routerLink2.setRoute(ContentLayout4.class);
        routerLink2.setText("Content 4");

        Div link2 = new Div();
        link2.add(routerLink2);

        this.add(link1, link2);
    }
}
