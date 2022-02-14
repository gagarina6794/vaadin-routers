package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "content-empty-2", layout = Tab2.class)
public class ContentLayoutEmpty2 extends VerticalLayout {

    public ContentLayoutEmpty2() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.getStyle().set("background", "#FFFFFF");
    }
}
