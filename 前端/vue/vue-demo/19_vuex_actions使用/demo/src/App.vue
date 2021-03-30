<template>
  <div id="app">
    {{ $store.state.counter }}
    <button @click="increment">按钮</button>
  </div>
</template>

<script>
export default {
  name: "app",
  methods: {
    increment() {
      this.$store.dispatch("incre").then(data => {
        console.log(data);
      });
    }
  }
};
</script>
