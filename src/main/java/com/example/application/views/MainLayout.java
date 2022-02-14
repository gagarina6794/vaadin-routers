package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RoutePrefix;
import com.vaadin.flow.router.RouterLayout;

@Route(value = "/")
@RoutePrefix("")
public class MainLayout extends VerticalLayout implements RouterLayout {

    public MainLayout() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.getStyle().set("background", "#FFFFFF");
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.setJustifyContentMode(JustifyContentMode.START);

        HeaderLayout headerLayout = new HeaderLayout();
        add(headerLayout);
    }
}
