package com.example.application.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "content3", layout = Tab2.class)
public class ContentLayout3 extends VerticalLayout {

    public ContentLayout3() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.getStyle().set("background", "#f78c6c");

        this.add("Content 3");
    }
}
