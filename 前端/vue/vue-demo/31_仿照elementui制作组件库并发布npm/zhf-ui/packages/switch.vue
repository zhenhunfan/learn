<template>
  <label class="zhf-switch" :class="{ 'is-checked': value }">
    <span class="zhf-switch__core" ref="core">
      <span class="zhf-switch__button"></span>
    </span>
    <input
      class="zhf-switch__input"
      type="checkbox"
      :name="name"
      @click="handleClick"
    />
  </label>
</template>

<script>
export default {
  name: "zhf-switch",
  components: {},
  props: {
    name: {
      type: String,
      default: "",
    },
    value: {
      type: Boolean,
      default: false,
    },
    activeColor: {
      type: String,
      default: "",
    },
    inactiveColor: {
      type: String,
      default: "",
    },
  },
  data() {
    return {};
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {
    // 设置颜色
    this.setColor();
  },
  methods: {
    async handleClick() {
      this.$emit("input", !this.value);
      // 数据修改后，等待DOM更新
      await this.$nextTick();
      this.setColor();
    },
    setColor() {
      if (this.activeColor || this.inactiveColor) {
        let color = this.value ? this.activeColor : this.inactiveColor;
        this.$refs.core.style.borderColor = color;
        this.$refs.core.style.backgroundColor = color;
      }
    },
  },
};
</script>
<style scoped lang="scss">
.zhf-switch {
  display: inline-flex;
  align-items: center;
  position: relative;
  font-size: 14px;
  line-height: 20px;
  height: 20px;
  vertical-align: middle;
  .zhf-switch__input {
    position: absolute;
    width: 0;
    height: 0;
    opacity: 0;
    margin: 0;
  }
  .zhf-switch__core {
    margin: 0;
    display: inline-block;
    position: relative;
    width: 40px;
    height: 20px;
    border: 1px solid #dcdfe6;
    outline: none;
    border-radius: 10px;
    box-sizing: border-box;
    background: #dcdfe6;
    cursor: pointer;
    transition: border-color 0.3s, background-color 0.3s;
    vertical-align: middle;
    .zhf-switch__button {
      position: absolute;
      top: 1px;
      left: 1px;
      border-radius: 100%;
      transition: all 0.3s;
      width: 16px;
      height: 16px;
      background-color: #fff;
    }
  }
}
.zhf-switch.is-checked {
  .zhf-switch__core {
    border-color: #409eff;
    background-color: #409eff;
    .zhf-switch__button {
      transform: translateX(20px);
    }
  }
}
</style>