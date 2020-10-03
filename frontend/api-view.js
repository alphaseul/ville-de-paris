import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-upload/src/vaadin-upload-file.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class ApiView extends PolymerElement {

    static get template() {
        return html`
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<a href="home"><img src="" alt="logo" id="logo"></a>
<br>

<div class="d-flex mx-auto">
<div class="mt-3 ml-3 " style="width: 50%;">
 <input type="text" id="inputExportDataBase" class="form-control col-md-5 mb-3" placeholder="Data Base Name" required>
 <input type="text" id="inputExportPath" class="form-control " placeholder="/Users/sowalpha/Desktop/Documents/data.csv" required>
 <button id="Export" class="btn btn-primary mt-3">Export</button>
</div>
<div class="mt-3 ml-3 " style="width: 50%;">
 <input type="text" id="inputImportDataBase" class="form-control col-md-5 mb-3" placeholder="Data Base Name" required>
 <input type="text" id="inputImportPath" class="form-control " placeholder="/Users/sowalpha/Desktop/Documents/data.csv" required>
 <button id="import "class="btn btn-primary mt-3">Import</button>
</div>
</div>

`;
    }
    static get is() {
        return 'api-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }

}


customElements.define(ApiView.is, ApiView);
