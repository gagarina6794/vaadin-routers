package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "content4", layout = Tab2.class)
public class ContentLayout4 extends VerticalLayout {

    public ContentLayout4() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.getStyle().set("background", "#c3e88d");

        this.add("Content 4");
    }
}
