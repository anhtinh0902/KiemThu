
<template>
    <div  style="margin-top: 100px;"  >
        <h1>INFORMATIONS</h1>
        <ul >
            <li><img :src="informations.image"  alt="..."  /></li>
            <li>{{informations.Name}}</li>
            <li>{{informations.Class}}</li>
            <li>{{informations.School}}</li>
            <li>{{informations.Tel}}</li>
            <li>{{informations.Email}}</li> 
            <li>{{informations.Adress}}</li>
        </ul>
    </div>
</template>

<script>

import { mapGetters } from 'vuex'
export default {
    name: 'About',
    props: ['About'],
    computed: {
        ...mapGetters(['informations']),
        
    },
    methods: {

    },
}
</script>

<style>
ul{
    list-style-type: none;
}
</style>
