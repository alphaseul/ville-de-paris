import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `donnees-view`
 *
 * DonneesView element.
 *
 * @customElement
 * @polymer
 */
class DonneesView extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'donnees-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(DonneesView.is, DonneesView);
