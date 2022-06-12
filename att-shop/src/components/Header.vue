<template>
  <div class="header bg-dark text-white fixed-top"  >
    <nav class="navbar navbar-expand-lg navbar-light" >
      <!-- <a class="navbar-brand" href="#">Navbar</a> -->
      <button
        class="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="container item-header">
        <ul
          class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0 navbar-nav"
        >
          <li class="nav-item active nav-item">
            <router-link class="nav-link text-white nav-link" to="/">Home </router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link text-white" to="/about"
              >About
            </router-link>
          </li>

        </ul>
    
        <form class="form-inline my-2 my-lg-0" >
          <input
            class="form-control mr-sm-2"
            type="string"
            placeholder="Search"
            @input="onChangeMethod($event)"
          />
          <button class="btn btn-outline-success my-2 my-sm-0">Search</button>
        </form>

        
      </div>
    </nav>
  </div>
  <button
    type="submit"
    class="font-weight-bold ml-auto fixed-bottom"
    style="
      color: rgb(250, 248, 246);
      background-color: blue;
      border-color: chocolate;
      border-color: chocolate;
      width: 70px;
      height:70px;
      margin-right: 30px;
      margin-bottom: 30px;
    "
  >
    <div class="cart">
      <router-link to="/shopping-cart">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="30"
          height="30"
          fill="currentColor"
          class="bi bi-cart3"
          viewBox="0 0 16 16"
        >
          <path
            d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .49.598l-1 5a.5.5 0 0 1-.465.401l-9.397.472L4.415 11H13a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l.84 4.479 9.144-.459L13.89 4H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"
          />
        </svg>
        <span> {{ cart.length }}</span>
      </router-link>
    </div>
  </button>
</template>

<script>
import { mapGetters, mapActions } from "vuex";

export default {
  name: "Header",
  computed: {
    ...mapGetters(["searchValue", "cart"]),
  },
  methods: {
    ...mapActions(["changesFilterValue"]),
    onChangeMethod(event) {
      console.log(event.target.value);
      this.changesFilterValue(event.target.value);
    },
  },
};
</script>

<style scope>
.header {
  background-color: #fff6f9;
 
  margin-right:0 ;
  float: left;
}

.item-header {
  padding: 10px 0px;
}

.cart svg {
  color: white;
  margin-top: -10px;
}

.cart span {
  color: white;
  margin-bottom: 10px;
}

.navbar-nav .nav-item:hover .nav-link
            {
                color: #fff;
                background-color:orange;
                border-radius:5px
            }
</style>
