import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-menu-bar/src/vaadin-menu-bar.js';

class HomeView extends PolymerElement {

    static get template() {
        return html`
<style>
        .btn0{
            border-radius: 10px;
            background-color: #002080;
        }
        .btn1{
            font-size: 14px;
            border-radius: 10px;
        }
    </style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<div class="container">
 <a href="#"></a>
 <br>
 <div class="navbar mt-2">
  <div class="navbar bg-dark">
   <a href="home" class="btn btn0 btn-lg text-light ">Acceuil</a>
   <a href="#" class="btn btn0 btn-lg text-light ">Les Données</a>
   <a href="#" class="btn btn0 btn-lg text-light ">API</a>
  </div>
  <div>
   <a href="login" class="btn btn0 btn-primary text-light " style="margin-left: 20%">Connexion</a>
  </div>
 </div>
</div>
<hr>
<div class="container">
 <div style="border-radius: 10px; background: #000000;  margin-top: 90px; margin-left: 20%;">
  <p style=" color:  #cc8800; height: 30px; margin-left: 5%;  "> Retrouver les donées par thématique :</p>
 </div>
 <div>
  <div class="buttonrange1" style="margin-left: 30%; margin-bottom: 2%;">
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-info btn-lg mr-3">Administration et Finances publique</button>
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-danger btn-lg mr-3">Citoyenneté</button>
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-info btn-lg">Commerces et Tourisme</button>
  </div>
  <div class="buttonrange2" style="margin-left: 30%; margin-bottom: 2%;">
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-warning btn-lg mr-3">Culture</button>
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-success btn-lg mr-3">Environnement</button>
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-primary btn-lg ">Equipements, Services, Social</button>
  </div>
  <div class="buttonrange3" style="margin-left: 30%; margin-bottom: 2%;">
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-danger btn-lg mr-3">Mobilité et Espace Public</button>
   <button type="button" onclick="window.location.href='#'" class="btn btn1 bg-secondary btn-lg ">Urbanisme et Logement</button>
  </div>
 </div>
</div>
<hr>
`;
    }

    static get is() {
        return 'home-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(HomeView.is, HomeView);
