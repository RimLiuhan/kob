<template>
  <nav-bar></nav-bar>
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue';
import $ from 'jquery';

export default {
  components: {
    NavBar
  },

  setup() {
      $.ajax({
      url: "http://127.0.0.1:3000/user/account/token/",
      type: "post",
      data: {
        username: "lh",
        password: "admin",
      },
      success(resp) {
        console.log(resp);
      },
      error(resp) {
        console.log(resp);
      }
    })
  }
  
 
}
</script>

<style>

</style>
