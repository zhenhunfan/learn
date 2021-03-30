<template>
  <div id="app">
    {{ $store.state.counter }}
    <button @click="increment">按钮</button>
  </div>
</template>

<script>
import * as types from "./store/mutations.types";
export default {
  name: "app",
  methods: {
    increment() {
      this.$store.commit({
        type: types.INCREMENT
      });
    }
  }
};
</script>
