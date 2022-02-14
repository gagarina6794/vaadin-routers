package com.example.application.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;

@Route(value = "inside-empty-1", layout = ContentLayoutEmpty1.class)
public class InsideEmpty1 extends Div implements HasUrlParameter<String> {

    private Dialog dialog = new Dialog();

    public InsideEmpty1() {
        setSizeFull();
        getElement().setProperty("background", "#89ddff");
        getElement().setProperty("color", "#FFFFFF");
        add("inside empty 1");

        dialog.setCloseOnOutsideClick(true);
        dialog.setWidth("300px");
        dialog.setHeight("300px");

        Button btn = new Button("Open dialog", e -> {
            String route = RouteConfiguration.forSessionScope().getUrl(InsideEmpty1.class, "openedDialog");
            UI.getCurrent().getPage().setLocation(route);
        });
        add(btn);
    }

    @Override
    public void setParameter(BeforeEvent beforeEvent, String parameter) {
        if (parameter != null) {
            if ("openedDialog".equals(parameter)) {
                dialog.open();
            }
        }
    }
}
