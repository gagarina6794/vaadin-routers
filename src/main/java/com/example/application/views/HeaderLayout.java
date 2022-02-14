package com.example.application.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;

public class HeaderLayout extends HorizontalLayout {

    public HeaderLayout() {
       init();
    }

    private void init() {
        this.setHeight("100px");
        this.setWidthFull();
        this.getStyle().set("background", "#6200EE");
        this.setPadding(false);

        Div firstLink = new Div();
        firstLink.setHeightFull();
        firstLink.getStyle().set("background", "#3700B3");
        firstLink.getStyle().set("display", "flex");
        firstLink.getStyle().set("align-items", "center");
        firstLink.getStyle().set("color", "#FFFFFF");

        RouterLink sideBar1Link = new RouterLink();
        sideBar1Link.setText("Tab 1");
        sideBar1Link.setRoute(ContentLayoutEmpty1.class);
        firstLink.add(sideBar1Link);

        Div secondLink = new Div();
        secondLink.setHeightFull();
        secondLink.getStyle().set("background", "#3700B3");
        secondLink.getStyle().set("display", "flex");
        secondLink.getStyle().set("align-items", "center");
        secondLink.getStyle().set("color", "#FFFFFF");

        RouterLink sideBar2Link = new RouterLink();
        sideBar2Link.setText("Tab 2");
        sideBar2Link.setRoute(ContentLayoutEmpty2.class);
        secondLink.add(sideBar2Link);

        add(firstLink, secondLink);
    }
}
