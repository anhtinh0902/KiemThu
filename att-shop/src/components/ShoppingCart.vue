<template>
    <div class="mt-4 mb-4">
        <h1>Shopping Cart</h1>
        <div class="container">
            <div class="row">
                <h5 v-if="cart.length == 0" class="mt-4 mb-4">
                    Giỏ hàng của bạn đang trống.
                    <router-link to="/"> Quay về trang chủ </router-link>
                </h5>
                <div
                    class="col-sm-12 col-md-12 col-md-offset-1"
                    v-if="cart.length > 0"
                >
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Product</th>
                                <th colspan="2">Quantity</th>
                                <th class="text-center">Price</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="item in cart" :key="item.id">
                                <td class="col-sm-8 col-md-6">
                                    <div class="media">
                                        <a class="thumbnail pull-left" href="#">
                                            <img
                                                class="media-object"
                                                :src="item.image"
                                                style="
                                                    width: 72px;
                                                    height: 72px;
                                                "
                                            />
                                        </a>
                                        <div class="media-body">
                                            <h6 class="media-heading">
                                                {{ item.name }}
                                            </h6>
                                        </div>
                                    </div>
                                </td>
                                <td
                                    class="col-sm-2 col-md-2"
                                    style="text-align: center"
                                    colspan="2"
                                >
                                    <div class="btn-group">
                                        <button
                                            type="button"
                                            class="btn btn-outline-secondary"
                                            @click="handleMinus(item.id)"
                                        >
                                            <svg
                                                xmlns="http://www.w3.org/2000/svg"
                                                width="16"
                                                height="16"
                                                fill="currentColor"
                                                class="bi bi-plus"
                                                viewBox="0 0 16 16"
                                            >
                                                <path
                                                    d="M4 8a.5.5 0 0 1 .5-.5h7a.5.5 0 0 1 0 1h-7A.5.5 0 0 1 4 8z"
                                                />
                                            </svg>
                                        </button>
                                        <input
                                            type="text"
                                            class="quanlity"
                                            :value="item.quantily"
                                            disabled
                                        />
                                        <button
                                            type="button"
                                            class="btn btn-outline-secondary"
                                            @click="handlePlus(item.id)"
                                        >
                                            <svg
                                                xmlns="http://www.w3.org/2000/svg"
                                                width="16"
                                                height="16"
                                                fill="currentColor"
                                                class="bi bi-plus"
                                                viewBox="0 0 16 16"
                                            >
                                                <path
                                                    d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"
                                                />
                                            </svg>
                                        </button>
                                    </div>
                                </td>
                                <td class="col-sm-1 col-md-1 text-center">
                                    <strong> ${{ item.price }} </strong>
                                </td>
                                <td class="col-sm-1 col-md-1">
                                    <button
                                        type="button"
                                        class="btn btn-danger"
                                        @click="handleDelete(item.id)"
                                    >
                                        <span
                                            class="glyphicon glyphicon-remove"
                                        ></span>
                                        Remove
                                    </button>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td><h3>Total</h3></td>
                                <td class="text-right">
                                    <h3>
                                        <strong>${{ subTotal }}</strong>
                                    </h3>
                                    <button class="btn btn-primary"   data-bs-toggle="modal" data-bs-target="#myModal">Đặt hàng</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                     <router-link to="/"> Quay về trang chủ </router-link>
                    
                </div>
            </div>
        </div>
    </div>

    <!-- The Modal -->
<div class="modal" id="myModal" >
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">Thông Tin Khách Hàng</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body" >
        Nhập Họ Tên: <br>
        <input type="text" class="form-control">
        <br>
         Nhập Số điện thoại: <br>
        <input type="number" class="form-control">
        <br>
         Nhập Địa chỉ: <br>
        <input type="text" class="form-control">
        <br> Ghi chú: <br>
       <textarea name="Ghichu" id="" cols="10" rows="5" class="form-control"></textarea>
        <br>
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
          <button class="btn btn-success">Thanh Toán</button>
        <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
      </div>

    </div>
  </div>
</div>


</template>

<script>
import { mapGetters, mapActions } from 'vuex'

export default {
    name: 'ShoppingCart',
    computed: {
        ...mapGetters(['cart']),
        subTotal() {
            return this.cart.reduce((total, item) => {
                return total + item.price * item.quantily
            }, 0)
        },
    },
    methods: {
        ...mapActions(['updateCart']),
        handlePlus(id) {
            const data = {
                action: 'PLUS_PRODUCT',
                value: id,
            }
            this.updateCart(data)
        },
        handleMinus(id) {
            const data = {
                action: 'MINUS_PRODUCT',
                value: id,
            }
            this.updateCart(data)
        },
        handleDelete(id) {
            const data = {
                action: 'DELETE_PRODUCT',
                value: id,
            }
            this.updateCart(data)
        },
    },
}
</script>

<style>
.quanlity {
    width: 70px;
    border-radius: 0px;
    border: 1px solid rgb(97, 97, 102);
    text-align: center;
}
</style>
