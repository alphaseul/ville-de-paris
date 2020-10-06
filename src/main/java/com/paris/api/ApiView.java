package com.paris.api;

import com.paris.DataTable;
import com.paris.connectData;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Input;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the api-view template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("api")
@PageTitle("api")
@Tag("api-view")
@JsModule("./api-view.js")
public class ApiView extends PolymerTemplate<ApiView.ApiViewModel> {

    @Id("logo")
    private Image logo;
    @Id("inputExportDataBase")
    private Input inputExportDataBase;
    @Id("inputExportPath")
    private Input inputExportPath;
    @Id("Export")
    private NativeButton buttonExport;
    @Id("inputImportDataBase")
    private Input inputImportDataBase;
    @Id("inputImportPath")
    private Input inputImportPath;
    @Id("import ")
    private NativeButton buttonImport;

    public ApiView() {
        logo.setSrc("http://localhost/site-ville-Paris/logo/logo.png");
        buttonExport.addClickListener(event -> {
            connectData exportData = new connectData(inputExportDataBase.getValue());
            exportData.exportData(inputExportPath.getValue(),"select * from ville");
        });
        buttonImport.addClickListener(event -> {
            DataTable table = new DataTable("ville",2);
            connectData importData = new connectData(inputImportDataBase.getValue());
            importData.ImportData(inputImportPath.getValue(),table);
        });
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between ApiView and api-view
     */
    public interface ApiViewModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }

}
