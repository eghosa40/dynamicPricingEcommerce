import { createApp } from "vue";
import App from "./App.vue";
import { createVuetify } from "vuetify";
import "vuetify/styles"; // Import Vuetify styles
import "@mdi/font/css/materialdesignicons.css"; // Import Material Design Icons (optional)

const vuetify = createVuetify();

createApp(App).use(vuetify).mount("#app");
