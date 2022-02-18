package com.example.application.views;

import com.example.application.views.webdriver.RandomGoogleLayout;
import com.example.application.views.webdriver.RandomLightShotLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

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

        VerticalLayout firstDiv = new VerticalLayout();
        firstDiv.setHeight("100px");

        RouterLink lightshotrLink = new RouterLink("See random lightshot image", RandomLightShotLayout.class);
        RouterLink googleLink = new RouterLink("See random google image", RandomGoogleLayout.class);
        firstDiv.add(lightshotrLink, googleLink);

        add(firstDiv);
    }
}
