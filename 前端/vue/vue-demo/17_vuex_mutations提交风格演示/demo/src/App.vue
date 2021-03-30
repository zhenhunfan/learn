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
      const count = 5;
      const count2 = 10;
      this.$store.commit({
        type: "increment",
        count,
        count2
      });
    }
  }
};
</script>
</style>
