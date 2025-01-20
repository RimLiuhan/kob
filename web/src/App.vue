<template>
  <nav-bar></nav-bar>
  <router-view/>
</template>

<script>
import NavBar from './components/NavBar.vue';
// import $ from 'jquery';

export default {
  components: {
    NavBar
  },

  // setup() {
  //     $.ajax({
  //     url: "http://127.0.0.1:3000/user/account/token/",
  //     type: "post",
  //     data: {
  //       username: "lh",
  //       password: "admin",
  //     },
  //     success(resp) {
  //       console.log(resp);
  //     },
  //     error(resp) {
  //       console.log(resp);
  //     }
  //   }),

  //   $.ajax({
  //     url: "http://127.0.0.1:3000/user/account/info/",
  //     type: "get",
  //     headers: {
  //       Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkYTU1NTk5NzZiNzQ0M2Q5ODYyM2MxYzkxODE5MTZlNiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTczNzM2MjI3NywiZXhwIjoxNzM4NTcxODc3fQ.jLvDw_rPRCsXLpUA_XlrtMy35gJsNJqZePE8y2VpmXg"
  //     },
  //     success(resp) {
  //       console.log(resp);
  //     },
  //     error(resp) {
  //       console.log(resp);
  //     }
  //   })

  //   $.ajax({
  //     url: "http://127.0.0.1:3000/user/account/register/",
  //     type: "post",
  //     data: {
  //       username: "rim1",
  //       password: "123456",
  //       confirmPassword: "123456",
  //     },
  //     success(resp) {
  //       console.log(resp);
  //     },
  //     error(resp) {
  //       console.log(resp);
  //     }
  //   })
  // }
  
 
}
</script>

<style>

</style>
