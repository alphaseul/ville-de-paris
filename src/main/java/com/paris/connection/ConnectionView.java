package com.paris.connection;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the connection-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("login")
@PageTitle("login")
@Tag("connection-view")
@JsModule("./connection-view.js")
public class ConnectionView extends PolymerTemplate<ConnectionView.ConnectionViewModel> {

    /**
     * Creates a new ConnectionView.
     */
    public ConnectionView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between ConnectionView and connection-view
     */
    public interface ConnectionViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
    public void clique(){
        UI.getCurrent().navigate("home");
    }
}
