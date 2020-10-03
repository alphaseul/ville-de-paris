package com.paris.donnees;

import com.paris.connectData;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

import javax.swing.*;
import javafx.stage.Stage;
import java.io.File;

/**
 * A Designer generated component for the donnees-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("donnees")
@PageTitle("donnees")
@Tag("donnees-view")
@JsModule("./donnees-view.js")
public class DonneesView extends PolymerTemplate<DonneesView.DonneesViewModel> {

    @Id("logo")
    private Image logo;

    /**
     * Creates a new DonneesView.
     */

    public DonneesView() {
        logo.setSrc("http://localhost/site-ville-Paris/logo/logo.png");
        // You can initialise any data required for the connected UI components here.
    }
    /**
     * This model binds properties between DonneesView and donnees-view
     */
    public interface DonneesViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
