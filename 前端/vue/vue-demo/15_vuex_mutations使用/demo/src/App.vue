<template>
  <div id="app">
    {{ $store.state.msg }}
    <button @click="btnClick">按钮</button>
  </div>
</template>

<script>
export default {
  name: "app",
  methods: {
    btnClick() {
      this.$store.commit("changeMsg");
    }
  }
};
</script>
