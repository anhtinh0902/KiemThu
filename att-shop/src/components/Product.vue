<template>
    <div class="col mb-4">
     
        <div class="card">
            <img :src="product.image" class="card-img-top " alt="..."  />
            <div class="card-body">
                <router-link :to="`/detail-product/${product.id}`">
                    <h5 class="card-title">{{ product.name }}</h5></router-link
                >
                <p class="card-text">
                    {{ product.price }} $
                    <br />
                    <small> {{ product.description }} </small>
                </p>
                <button
                    class="btn btn-primary btn-block"
                    @click="handleUpdateCart()"
                >
                    Add To Cart
                </button>
            </div>
        </div>
    </div>
</template>

<script>
import { mapActions } from 'vuex'
export default {
    name: 'Product',
    props: ['product'],
    methods: {
        ...mapActions(['updateCart']),
        handleUpdateCart() {
            const data = {
                action: 'ADD_TO_CART',
                value: this.product,
            }
            this.updateCart(data)
        },
    },
    computed: {

    },
}
</script>

<style></style>
