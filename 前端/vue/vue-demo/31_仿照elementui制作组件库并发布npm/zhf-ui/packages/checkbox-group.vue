<template>
  <div class="zhf-checkbox-group">
    <slot></slot>
  </div>
</template>

<script>
export default {
  name: "zhf-checkbox-group",
  props: {
    value: {
      type: Array,
      default() {
        return [];
      },
    },
  },
  provide() {
    return {
      CheckboxGroup: this,
    };
  },
};
</script>
<style scoped>
</style>