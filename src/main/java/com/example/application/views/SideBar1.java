package com.example.application.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;

public class SideBar1 extends VerticalLayout {

    public SideBar1() {
        init();
    }

    private void init() {
        this.setWidth("200px");
        this.setHeightFull();
        this.getStyle().set("background", "#03DAC6");

        RouterLink routerLink1 = new RouterLink();
        routerLink1.setRoute(ContentLayout1.class);
        routerLink1.setText("Content 1");

        Div link1 = new Div();
        link1.add(routerLink1);

        RouterLink routerLink2 = new RouterLink();
        routerLink2.setRoute(ContentLayout2.class);
        routerLink2.setText("Content 2");

        Div link2 = new Div();
        link2.add(routerLink2);

        this.add(link1, link2);
    }
}
