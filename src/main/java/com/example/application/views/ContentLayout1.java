package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "content1", layout = Tab1.class)
public class ContentLayout1 extends VerticalLayout {

    public ContentLayout1() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.getStyle().set("background", "#32424A");

        this.add("Content 1");

    }
}
