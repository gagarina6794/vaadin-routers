package com.example.application.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

import java.util.List;
import java.util.Map;

@Route(value = "content-empty-1", layout = Tab1.class)
@RoutePrefix("content-empty-1")
@ParentLayout(Tab1.class)
public class ContentLayoutEmpty1 extends VerticalLayout implements RouterLayout {

    public ContentLayoutEmpty1() {
        init();
    }

    private void init() {
        this.setSizeFull();
        this.setPadding(false);
        this.setMargin(false);
        this.setSpacing(false);
        this.getStyle().set("background", "#FFFFFF");

        Div firstDiv = new Div();
        firstDiv.setHeight("50px");

        RouterLink routerLink = new RouterLink("See random image", InsideEmpty1.class);
        firstDiv.add(routerLink);

        add(firstDiv);
    }
}
