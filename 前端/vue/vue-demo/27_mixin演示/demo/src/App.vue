<template>
  <div id="app">
    {{ msg }}
    <br />
    {{ meth }}
    <br />
    {{ mou }}
    <br />
    <button @click="show">按钮</button>
  </div>
</template>

<script>
import { mi } from "./cmmon/mixin";
export default {
  name: "app",
  mixins: [mi]
};
</script>
