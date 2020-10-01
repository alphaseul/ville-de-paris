import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-upload/src/vaadin-upload-file.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';

class ApiView extends PolymerElement {

    static get template() {
        return html`
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<a href="home"><img src="" alt="logo" id="logo"></a>
<br>
<div class="form1 mt-3" style="background-color: #002080; height: 100px;">
 <nav class="navbar navbar-light">
  <form class="form-inline">
   <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
   <button id="search" class="btn btn-outline-light my-2 my-sm-0" type="submit" style="flex-grow: 0;">Search</button>
  </form>
 </nav>
</div>
<vaadin-upload id="uploadfile" accept=".csv"></vaadin-upload>
<button class="btn btn-primary">Import</button>
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
