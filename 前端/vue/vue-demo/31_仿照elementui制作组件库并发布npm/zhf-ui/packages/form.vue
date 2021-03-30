<template>
  <div class="zhf-form">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "zhf-form",
  provide() {
    return {
      Form: this,
    };
  },
  props: {
    model: {
      type: Object,
      required: true,
    },
    labelWidth: {
      type: String,
      default: "80px",
    },
  },
};
</script>
<style scoped>
</style>