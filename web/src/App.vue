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
  //     url: "https://app7466.acapp.acwing.com.cn/api/user/account/token/",
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
  //     url: "https://app7466.acapp.acwing.com.cn/api/user/account/info/",
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
  //     url: "https://app7466.acapp.acwing.com.cn/api/user/account/register/",
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
body{
  background-image: url("@/assets/images/GJ01.jpg");
  background-size: cover;
}
</style>
