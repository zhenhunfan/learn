<template>
  <div class="zhf-form-item">
    <label class="zhf-form-item__label" :style="labelStyle">{{ label }}</label>
    <div class="zhf-form-item__content">
      <slot></slot>
    </div>
  </div>
</template>

<script>
export default {
  name: "zhf-form-item",
  props: {
    label: {
      type: String,
      default: "",
    },
  },
  inject: ["Form"],
  computed: {
    labelStyle() {
      return {
        width: this.Form.labelWidth,
      };
    },
  },
};
</script>
<style lang="scss">
.zhf-form-item {
  margin-bottom: 25px;
  .zhf-form-item__label {
    text-align: right;
    vertical-align: middle;
    float: left;
    font-size: 14px;
    color: #606266;
    line-height: 40px;
    padding: 0 12px 0 0;
    box-sizing: border-box;
  }
  .zhf-form-item__content {
    line-height: 40px;
    position: relative;
    font-size: 14px;
    overflow: hidden;
  }
}
</style>