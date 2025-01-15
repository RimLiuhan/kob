<template>
  <div>
    <h1>姓名: {{ name }}</h1>
    <h1>年龄: {{ age }}</h1>
  </div>
  <router-view/>
</template>

<script>
import { ref } from 'vue';
import $ from 'jquery';

export default {
  setup() {
    let name = ref('');
    let age = ref('');

    $.ajax({
      url: "http://localhost:3000/pk/index/",
      type: "GET",
      success(resp) {
        console.log(resp);
        name.value = resp.name;
        age.value = resp.age;
      }
    })

    return {
      name,
      age
    }
  }
 
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
