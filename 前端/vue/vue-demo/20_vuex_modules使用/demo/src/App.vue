<template>
  <div id="app">
    <div>{{ "我是root里的state中的counter " + $store.state.counter }}</div>
    <div>
      {{ "我是moduleA里的state中的counter " + $store.state.ModuleA.counter1 }}
      <br />
      <button @click="mutation">moduleA中的mutations提交</button>
      <br />
      <button @click="action">moduleA中的actions分发</button>
      <br />
      {{
        "我是moduleA里的getters中的powercounter " + $store.getters.powercounter
      }}
      <br />
      {{ "我是moduleA里的getters中的power2 " + $store.getters.power2 }}
    </div>
  </div>
</template>

<script>
export default {
  name: "app",
  methods: {
    mutation() {
      this.$store.commit("increment");
    },
    action() {
      this.$store.dispatch("incre").then(result => {
        console.log(result);
      });
    }
  }
};
</script>

