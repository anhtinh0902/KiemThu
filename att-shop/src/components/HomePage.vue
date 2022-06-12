<template>
   
    <div class="container" style="margin-top: 100px;">
      <div id="demo" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  
  <!-- The slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="@/assets/carousel/1.jpg" alt="Los Angeles" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="@/assets/carousel/2.jpg" alt="Chicago" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="@/assets/carousel/3.jpg" alt="New York" width="1100" height="500">
    </div>
  </div>
  
  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>



       <h1>XE MÔ HÌNH TẠI ATT_SHOP</h1>
    <div class="row box-product">
      <Product
        v-for="product in filterProducts"
        :key="product.id"
        :product="product"
        class="col-4"
      />
    </div>
  </div>
  
</template>

<script>
import { mapGetters } from "vuex";
import Product from "./Product.vue";

export default {
  name: "HomePage",
  mounted() {
    this.$store.dispatch("loadCourses");
  },
  components: {
    Product,
  },
  methods: {
    logger() {
      console.log("logger", typeof this.searchValue);
    },
  },
  computed: {
    ...mapGetters(["products", "searchValue"]),
    filterProducts() {
      if (!this.searchValue) {
        return this.products;
      } else {
        const filterName = this.products.filter((item) =>
          item.name.toLowerCase().includes(this.searchValue.toLowerCase())
        );
        if (filterName.length == 0) {
          return this.products.filter((item) => item.price == this.searchValue);
        } else {
          return filterName;
        }
      }
    },
  },
};
</script>

<style>

</style>
