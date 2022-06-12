const mutations = {
    //Là những hàm để thay đổi state
    setStatus(state, status) {
        //status is payload
        //mapMutations
        //chuyển những hàm của mutation  về component hiện tại
        state.status = status
    },
    setCart(state, cart) {
        state.cart = cart
    },
    searchValue(state, searchValue) {
        state.searchValue = searchValue
    },
    setProductsAPI(state, products) {
        state.products = products
    },
}

export default mutations
