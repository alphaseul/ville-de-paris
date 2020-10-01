package com.paris.donnees;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

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

    /**
     * Creates a new DonneesView.
     */
    public DonneesView() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between DonneesView and donnees-view
     */
    public interface DonneesViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
