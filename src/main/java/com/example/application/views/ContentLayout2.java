package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "content2", layout = Tab1.class)
public class ContentLayout2 extends VerticalLayout {

    public ContentLayout2() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.getStyle().set("background", "#c3e88d");

        this.add("Content 2");
    }
}
