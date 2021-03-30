练习代码，一个自定义组件,toast提示信息

例子：
```vue
<template>
  <div id="app">
    <button @click="btnClick">按钮</button>
  </div>
</template>

<script>
export default {
  name: "app",
  methods: {
    btnClick() {
      this.$toast.show("哈哈哈");
    },
  },
};
</script>
```