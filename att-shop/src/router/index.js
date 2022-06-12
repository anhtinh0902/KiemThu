import { createWebHistory, createRouter } from 'vue-router'

import HomePage from '../components/HomePage.vue'
import ShoppingCart from '../components/ShoppingCart.vue'
import DetailProduct from '../components/DetailProduct.vue'
// tạo mảng chứa những đường link
const routes = [
    // trang load lên đầu tiên thì path chỉ là /
    {
        path: '/',
        name: 'HomePage',
        component: HomePage,
    },
    {
        path: '/about',
        name: 'About',
        component: () => import('../components/About'),
    },
    {
        path: '/shopping-cart',
        name: 'ShoppingCart',
        component: ShoppingCart,
    },
    {
        path: '/detail-product/:id',
        name: 'DetailProduct',
        component: DetailProduct,
    },
]
// tạo đối tượng router
const router = createRouter({
    history: createWebHistory(),
    routes,
})

export default router
