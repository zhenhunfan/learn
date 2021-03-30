<template>
  <label class="zhf-radio" :class="{ 'is-checked': label === model }">
    <span class="zhf-radio__input">
      <span class="zhf-radio__inner"></span>
      <input
        class="zhf-radio__original"
        type="radio"
        :name="name"
        :value="label"
        v-model="model"
      />
    </span>
    <span class="zhf-radio__label"
      ><slot>{{ label }}</slot>
    </span>
  </label>
</template>

<script>
export default {
  name: "zhf-radio",
  components: {},
  props: {
    label: {
      type: [String, Number, Boolean],
      default: "",
    },
    name: {
      type: String,
      default: "",
    },
    value: null,
  },
  inject: {
    RadioGroup: {
      default: "",
    },
  },
  computed: {
    model: {
      get() {
        return this.isGroup ? this.RadioGroup.value : this.value;
      },
      set(value) {
        this.isGroup
          ? this.RadioGroup.$emit("input", value)
          : this.$emit("input", value);
      },
    },
    // 判断包裹在group中
    isGroup() {
      return !!this.RadioGroup; //把一个对象转成一个Boolean值
    },
  },
};
</script>
<style lang="scss" scoped>
.zhf-radio {
  color: #606266;
  font-weight: 500;
  line-height: 1;
  position: relative;
  cursor: pointer;
  display: inline-block;
  white-space: nowrap;
  outline: none;
  font-size: 14px;
  margin-right: 30px;
  -moz-user-select: none;
  -webkit-user-select: none;
  -ms-user-select: none;
  .zhf-radio__input {
    white-space: nowrap;
    cursor: pointer;
    outline: none;
    display: inline-block;
    line-height: 1;
    position: relative;
    vertical-align: middle;
    .zhf-radio__inner {
      border: 1px solid #dcdfe6;
      border-radius: 100%;
      width: 14px;
      height: 14px;
      background-color: #fff;
      position: relative;
      cursor: pointer;
      display: inline-block;
      box-sizing: border-box;
      &:after {
        width: 4px;
        height: 4px;
        border-radius: 100%;
        background-color: #fff;
        content: "";
        position: absolute;
        left: 50%;
        top: 50%;
        transform: translate(-50%, -50%) scale(0);
        transition: transform 0.15s ease-in;
      }
    }
    .zhf-radio__original {
      opacity: 0;
      outline: none;
      position: absolute;
      z-index: -1;
      top: 0;
      left: 0px;
      right: 0;
      bottom: 0;
      margin: 0;
    }
  }
  .zhf-radio__label {
    font-size: 14px;
    padding-left: 10px;
  }
}
.zhf-radio.is-checked {
  .zhf-radio__input {
    .zhf-radio__inner {
      border-color: #409eff;
      background: #409eff;
      &:after {
        transform: translate(-50%, -50%) scale(1);
      }
    }
  }
  .zhf-radio__label {
    color: #409eff;
  }
}
</style>